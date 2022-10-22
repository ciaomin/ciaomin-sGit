package sec03.exam02;

public class OperationExample8 {
    public static void main(String[] args) {
        int v2 = 1;
        double v3 = 1.0;
        System.out.println(v2 == v3);
        /*
        (1 == 1.0) 은 같은 값이다
        따라서 true 산출
         */

        double v4 = 0.1;
        float v5 = 0.1f;
        System.out.println(v4 == v5);
        System.out.println((float)v4 == v5);
        /*
        (0.1 == 0.1f)는 다르다
        따라서 false 산출

        float 타입으로 v4를 강제 변환하였다
        ((float)v4 == v5) = (0.1f == v5)
        따라서 true 산출
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

        해결책은 피 연산자를 float 타입으로 변환해서 비교하거나 정수 타입으로 변환하여 비교하는 것이다
 */