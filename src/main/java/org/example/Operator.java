package org.example;

import java.util.Arrays;

public enum Operator {
    /**
     * 기존에 switch-case문을 사용해 연산을 구분한 것을, Enum을 활용해 더 직관적으로 표현
     * 각 연산자를 Enum의 상수로 표현하여 객체 지향적으로 관리 가능
     * 추상메서드 apply를 선언하여 각 연산자별로 익명클래스로 해당 메서드 구현
     */

    ADD("+") {
        @Override
        public <T extends Number> double apply(T a, T b) {
            return a.doubleValue() + b.doubleValue();
        }
    },
    SUBTRACT("-") {
        @Override
        public <T extends Number> double apply(T a, T b) {
            return a.doubleValue() - b.doubleValue();
        }
    },
    MULTIPLY("x") {
        @Override
        public <T extends Number> double apply(T a, T b) {
            return a.doubleValue() * b.doubleValue();
        }
    },
    MODULO("%") {
        @Override
        public <T extends Number> double apply(T a, T b) {
            if (b.doubleValue() == 0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }
            return a.doubleValue() % b.doubleValue();
        }
    };

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    //스트림과 람다식을 활용하여 사칙연산 기호 외의 입력값은 예외 발생
    public static Operator fromSymbol(String symbol) {
        return Arrays.stream(values())
                .filter(op -> op.symbol.equals(symbol))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("사칙연산 기호(+,-,x,%)만 입력 가능합니다."));
    }

    //메서드 수준에서 T를 선언하여 각 연산 별로 특정 타입에 묶이지 않도록 함
    //Number로 고정하여 doubleValue 메서드를 사용할 수 있도록 함
    public abstract <T extends Number> double apply(T a, T b);
}
