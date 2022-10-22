package sec03.exam01;

public class RunStatementExample19 {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의 가격:%d원\n", value);
        System.out.printf("상품의 가격:%6d원\n", value);
        System.out.printf("상품의 가격%-6d원\n", value);
        System.out.printf("상품의 가격:%06d원\n", value);
        /*
        첫 번째 식은 그냥 value 값만 넣으면 되는 기본적인 식 - "상품의 가격: 123원" 출력
        두 번째 식은 6자리 정수, 왼쪽에 공백이 생기는 식 - "상품의 가격:(3자리 공백이 생긴 후) 123원" 출력
        세 번째 식은 6자리 정수, 오른쪽에 공백이 생기는 식 - "상품의 가격:123 (3자리 공백이 생긴 후) 원" 출력
        네 번째 식은 6자리 정수, 왼쪽에 공백이 생기고 공백을 0으로 채우는 식 - "상품의 가격:000123원" 출력
         */


        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
        /*
        첫 번째는 정수 대입
        두 번째는 소수점 이상 7자리, 소수점 이하 2자리, 왼쪽에 공백 - area는 3.14159*10*10 = 314.159
        따라서 "반지름이 10인 원의 넓이:(4자리 공백이 생긴 후) 314.16" 출력
         */

        String name = "이경민";
        String job = "프로그래머";
        System.out.printf("%5d   %-6s   %6s\n", 1, name, job);

        /*
        이름과 직업 값을 설정
        첫 번째는 5자리 정수, 왼쪽에 공백이 생긴다
        두 번째는 오른쪽에 공백이 생기는 6자리 문자열
        세 번째는 왼쪽에 공백이 생기는 6자리 문자열

        따라서 [(4자리 공백이 생긴 후) 1 이경민 (5자리 공백이 생긴 후) (5자리 공백이 생긴 후) 프로그래머] 가 출력된다
         */
    }
}

/*
        printf 는 괄호 안에 첫 번째 문자열 형식대로 내용을 출력하라는 의미를 가진다
        ex - printf("형식 문자열", 값1, 값2, ...)
             %[argument_index$] [flags] [width] [.precision] [conversion]
              [값의 순번]          [-,0]  [전체 자릿수] [소수 자릿수] [변환 문자]
              [                    생략 가능                               ]

              형식 문자열에서 %와 conversion(변환 문자) 은 필수로 작성하고 그 외의 항목은 모두 생략할 수 있다
              %는 형식 문자열의 시작을 뜻하고 conversion에는 제공되는 값의 타입에 따라 d(정수), f(실수), s(문자열) 을 입력한다

              형식 문자열에 포함될 값이 2개 이상일 경우에는 값의 순번 (argument_index$)을 알려주어야 한다
              예를 들어 1$는 첫 번째 값을, 2$는 두 번째 값을 뜻한다

              ex - System.out.printf("이름: 1$s, 나이: 2$d", "이경민", 25); -> 이름: 이경민 나이: 25

              flags는 빈 자리를 채우는 방식인데 생략되면 왼쪽이 공백으로 채워지고, -가 오면 오른쪽이 공백으로 채워진다
              기본적으로 글자는 좌측에 붙여서 쓰는게 기본이므로 -가 오게 넣는 것이 편할 것이다
              0은 공백 자리를 공백이 아닌 0으로 채운다

              width는 전체 자릿수를 나타내며, precision은 소수 자릿수를 나타낸다

              자주 사용되는 형식 문자열은 다음과 같다
              정수 - %d - 입력한 정수가 출력 - 123 으로 출력
                  - %6d - 6자리 정수가 출력, 왼쪽에 빈자리 공백이 생긴다 - ___123
                  - %-6d - 6자리 정수가 출력, 오른쪽에 빈자리 공백이 생긴다 - 123___
                  - %06d - 6자리 정수가 출력, 왼쪽에 빈자리 공백을 0으로 채운다 - 000123

              실수 - %f - 전체 자릿수와 소수 자릿수 출력, 왼쪽 오른쪽 공백 설정은 같다 (ex - %5.2f 라면 소수점 이상 5자리, 소수점 이하 2자리)
                  - %10.2f - 소수점 이상 7자리, 소수점 이하 2자리, 왼쪽 빈 자리 공백 - ____123.45
                  - %-10.2f - 소수점 이상 7자리, 소수점 이하 2자리 , 오른쪽 빈 자리 공백 - 123.45____
                  - %010.2f - 소수점 이상 7자리, 소수점 이하 2자리, 왼쪽 빈자리 공백을 0으로 채운다 - 0000123.45

              문자열 - %s - 입력한 문자열 출력 - abc
                   - %6s - 6자리 문자열, 왼쪽 빈 자리 공백 - ___abc
                   - %-6s - 6자리 문자열, 오른쪽 빈자리 공백 - abc___

               특수문자 - \t - 탭 기능
                      - \n - 줄 바꿈
                      - %% - 역 % 출력
         */