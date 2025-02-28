package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    //가장 먼저 저장된 데이터를 삭제할 수 있도록 Queue 자료구조 사용
    //LinkedList<>를 사용하여 Queue 인터페이스를 구현하면 성능상 효율적
    private Queue<Integer> results = new LinkedList<>();

    public int calculate(int num1, int num2, String operator) {
        int result;
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
                result = num1 % num2;
                break;
            default:
                throw new IllegalArgumentException("사칙연산 기호(+,-,x,%)만 입력 가능합니다.");
        }
        results.add(result);
        return result;
    }

    public Integer removeOldestResult() {
        return results.poll();
    }

    public Queue<Integer> getResults() {
        // 반환받은 클래스에서 데이터를 수정할 수 없도록 값을 복사해서 전달
        return new LinkedList<>(results);
    }
}

