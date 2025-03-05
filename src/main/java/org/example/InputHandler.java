package org.example;

import java.util.Scanner;

public class InputHandler {
    private Scanner scanner = new Scanner(System.in);

    public <T extends Number> T getNumberInput(String message, Class<T> type) {
        return ExceptionHandler.handle(() -> {
            System.out.print(message);
            String input = scanner.nextLine();
            if (type == Integer.class) {
                Integer num = Integer.parseInt(input);
                if (num < 0) throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
                //T 타입으로 변환 후 반환(불필요한 형변환 예외 방지)
                return type.cast(num);
            } else {
                Double num = Double.parseDouble(input);
                if (num < 0) throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
                return type.cast(num);
            }
        });
    }

    public String getOperatorInput(Number num2) {
        return ExceptionHandler.handle(() -> {
            System.out.print("연산 기호를 입력하세요 (+, -, x, %): ");
            String operator = scanner.nextLine();
            if (!(operator.equals("+") || operator.equals("-") || operator.equals("x") || operator.equals("%"))) {
                throw new IllegalArgumentException("사칙연산 기호(+,-,x,%)만 입력 가능합니다.");
            }
            if (operator.equals("%") && num2.doubleValue() == 0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }
            return operator;
        });
    }

    public boolean shouldExit() {
        System.out.print("계속하려면 엔터를, 종료하려면 'exit'을 입력하세요: ");
        return scanner.nextLine().equalsIgnoreCase("exit");
    }
}
