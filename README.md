# 계산기를 만들어보자!
내일배움캠프 Spring 6기 자바 문법 종합반 과제로, 자바 문법의 실습과 객체 지향 개념 적용에 목표를 두고 있습니다.
# 요구사항 정의
## LV 1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기
- 양의 정수(0 포함) 입력 받기
    - [ ] Scanner를 사용하여 양의 정수 2개를 전달받는다.
    - [ ] 양의 정수는 각각 하나씩 전달받는다.
    - [ ] 양의 정수는 적합한 타입으로 선언한 변수에 저장한다.
- 사칙연산 기호(+,-,x,%)를 입력받기
    - [ ] Scanner를 사용하여 사칙연산 기호를 전달받는다.
    - [ ] 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장한다.
- 연산을 진행한 후 결과값 출력하기
    - [ ] 제어문을 사용해 연산기호를 구분한다.
    - [ ] 결과를 출력한다.
- 프로그램 무한 반복하기
    - [ ] 반복문을 사용하고, exit를 입력하면 프로그램을 종료한다.
- 예외 처리하기 (숫자 입력받기)
    - 숫자 입력받기
        - [ ] 숫자가 아닌 형태가 들어온 경우 예외를 발생시킨다.
        - [ ] 2개 미만, 혹은 2개 초과로 들어온 경우 예외를 발생시킨다.
        - [ ] 음의 정수가 들어온 경우 예외를 발생시킨다.
    - 사칙연산 입력받기
        - [ ] 사칙연산 기호 외에 문자가 들어온 경우 예외를 발생시킨다.
    - 연산 진행하기
        - [ ] 나눗셈 연산에서 분모가 0인 경우