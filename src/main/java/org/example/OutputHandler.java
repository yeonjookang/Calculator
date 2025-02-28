package org.example;

import java.util.Queue;

public class OutputHandler {

    public void printResult(int result) {
        System.out.println("결과: " + result);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printResults(Queue<Integer> results) {
        System.out.println("현재 저장된 연산 결과: " + results);
    }
}
