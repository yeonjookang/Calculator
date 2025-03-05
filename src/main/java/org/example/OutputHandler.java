package org.example;

import java.util.List;
import java.util.Queue;

public class OutputHandler<T extends Number> {

    public void printResult(T result) {
        System.out.println("결과: " + result);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printResults(Queue<T> results) {
        System.out.println("현재 저장된 연산 결과: " + results);
    }

    public void printFilteredResults(List<Double> results) {
        System.out.println("입력값보다 큰 결과들: " + results);
    }
}
