package org.example;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        InputHandler inputHandler = new InputHandler();
        OutputHandler outputHandler = new OutputHandler();

        while (true) {
            Number num1 = inputHandler.getNumberInput("첫 번째 양의 정수를 입력하세요: ", Double.class);
            Number num2 = inputHandler.getNumberInput("두 번째 양의 정수를 입력하세요: ", Double.class);
            String operator = inputHandler.getOperatorInput(num2);

            double result = ExceptionHandler.handle(() -> calculator.calculate(num1, num2, operator));
            outputHandler.printResult(result);

            double threshold = inputHandler.getNumberInput("필터링할 기준 값을 입력하세요: ", Double.class);
            outputHandler.printFilteredResults(calculator.getResultsGreaterThan(threshold));

            if (inputHandler.shouldExit()) {
                outputHandler.printMessage("프로그램을 종료합니다.");
                break;
            }
        }
    }
}