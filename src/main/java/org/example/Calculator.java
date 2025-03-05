package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Calculator<T extends Number> {
    //가장 먼저 저장된 데이터를 삭제할 수 있도록 Queue 자료구조 사용
    //LinkedList<>를 사용하여 Queue 인터페이스를 구현하면 성능상 효율적
    private Queue<Double> results = new LinkedList<>();

    public double calculate(T num1, T num2, String operator) {
        //제네릭을 활용하여 정수뿐만 아니라 소수도 입력받을 수 있도록 확장
        Operator op = Operator.fromSymbol(operator);
        double result = op.apply(num1, num2);
        results.add(result);
        return result;
    }

    public Double removeOldestResult() {
        return results.poll();
    }

    public Queue<Double> getResults() {
        return new LinkedList<>(results);
    }

    public List<Double> getResultsGreaterThan(double threshold) {
        //스트림과 람다식을 활용하여 results에 들어있는 값 중 threshold보다 큰 값만 필터링해서 반환
        return results.stream()
                .filter(result -> result > threshold)
                .collect(Collectors.toList());
    }
}

