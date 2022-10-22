package sec03.exam02;

public class OperationExample7 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);
        System.out.println("result3=" + result3);
        /*
        ==는 두 피 연산자의 값이 같은지를 검사하는 것
        따라서 result1 = true
        !=는 두 피 연산자의 값이 다른지를 검사하는 것
        따라서 result2 = false
        <=는 피 연산자 1이 피 연산자 2보다 작거나 같은지를 검사하는 것
        따라서 result3 = true
         */

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2);
        System.out.println("result4=" + result4);
        /*
        만약 피 연산자가 char 타입이면 유니코드 값으로 비교 연산을 수행한다
        'A'의 유니코드는 65, 'B'의 유니코드 값은 66이다
        따라서 result4 = true
         */
    }
}

/*
비교 연산자에서도 연산을 수행하기 전에 피 연산자의 타입을 일치시킨다
ex - 'A' == 65 는 'A' 가 int 타입으로 변환되어 65 == 65로 비교된다
     'A' == 65 -> 65 == 65 -> true

마찬가지로 3 == 3.0도 3이 double 타입으로 변환되어 3.0 == 3.0 으로 비교된다
        3 == 3.0 -> 3.0 == 3.0 -> true

        단 한 가지 예외가 있는데 0.1 == 0.1f 와 같은 경우다
        정상적이라면 0.1f가 왼쪽 피 연산자와 같은 double 타입으로 변환되어
        0.1 == 0.1 이 되고 true 가 산출 되어야 하지만 해당 연산은 false 가 산출된다

        그 이유는 실수의 저장 방ㅅㄱ인 부동 소수점 방식이 0.1을 정확히 표현할 수 없기 때문이다
        0.1f 는 0.1의 근삿값 (0.10000000149011612) 로 표현된다
        따라서 0.1보다 큰 값이 되어버린다
 */