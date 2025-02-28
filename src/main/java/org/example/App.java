package org.example;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        InputHandler inputHandler = new InputHandler();
        OutputHandler outputHandler = new OutputHandler();

        while (true) {
            int num1 = inputHandler.getIntInput("첫 번째 양의 정수를 입력하세요: ");
            int num2 = inputHandler.getIntInput("두 번째 양의 정수를 입력하세요: ");
            String operator = inputHandler.getOperatorInput(num2);

            int result = ExceptionHandler.handle(() -> calculator.calculate(num1, num2, operator));
            outputHandler.printResult(result);

            if (inputHandler.shouldExit()) {
                outputHandler.printMessage("프로그램을 종료합니다.");
                break;
            }
        }
    }
}