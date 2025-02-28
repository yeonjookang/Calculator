package org.example;

public class ExceptionHandler {
    /**
     * 템플릿 콜백 패턴을 활용한 예외 처리
     * 각 클래스에 while, try-catch 문이 중복적으로 사용되는 것을 방지
     * 예외 발생 시 메세지를 출력하고 올바른 값을 입력받을 때까지 반복적으로 요청하는 구조
     */
    public interface Task<T> {
        //Task<T>는 단 하나의 추상 메서드(execute())를 가지므로 람다 표현식으로 대체 가능
        T execute();
    }

    public static <T> T handle(Task<T> task) {
        while (true) {
            try {
                return task.execute();
            } catch (NumberFormatException e) {
                System.out.println("유효하지 않은 숫자입니다. 숫자만 입력해주세요.");
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
