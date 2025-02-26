package org.example;

import java.util.Scanner;

public class Calculator {

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("첫 번째 양의 정수를 입력하세요: ");
                int num1 = Integer.parseInt(scanner.nextLine());
                if (num1 < 0) throw new IllegalArgumentException("음수는 입력할 수 없습니다.");

                System.out.print("두 번째 양의 정수를 입력하세요: ");
                int num2 = Integer.parseInt(scanner.nextLine());
                if (num2 < 0) throw new IllegalArgumentException("음수는 입력할 수 없습니다.");

                System.out.print("연산 기호를 입력하세요 (+, -, x, %): ");
                String operator = scanner.nextLine();

                if (!(operator.equals("+") || operator.equals("-") || operator.equals("x") || operator.equals("%"))) {
                    throw new IllegalArgumentException("사칙연산 기호(+,-,x,%)만 입력 가능합니다.");
                }

                int result = 0;
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "x":
                        result = num1 * num2;
                        break;
                    case "%":
                        if (num2 == 0) {
                            throw new ArithmeticException("0으로 나눌 수 없습니다.");
                        }
                        result = num1 % num2;
                        break;
                }

                System.out.println("결과: " + result);
            } catch (NumberFormatException e) {
                System.out.println("유효하지 않은 숫자입니다. 숫자만 입력해주세요.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("계속하려면 엔터를, 종료하려면 'exit'을 입력하세요: ");
            String exit = scanner.nextLine();
            if (exit.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
        scanner.close();
    }
}

