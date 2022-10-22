package sec03.exam02;

public class OperationExample4 {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 2;

        int result1 = v1 + v2;
        System.out.println("result1=" + result1);
        /*
        v1 = 5, v2 = 2
        따라서 result1은 7
         */

        int result2 = v1 - v2;
        System.out.println("result2=" + result2);
        /*
        v1 = 5, v2 = 2
        따라서 result2은 3
         */

        int result3 = v1 * v2;
        System.out.println("result3=" + result3);
        /*
        v1 = 5, v2 = 2
        따라서 result3은 10
         */

        int result4 = v1 / v2;
        System.out.println("result4=" + result4);
        /*
        v1 = 5, v2 = 2
        5 / 2 = 2.5 하지만 int 타입에선 정수 부분만 저장되므로 result4는 2
         */

        int result5 = v1 % v2;
        System.out.println("result5=" + result5);
        /*
        v1 = 5, v2 = 2
        5 / 2 = 2씩 나누어지고 1이 남는다
        나머지를 넣는건가? 그렇다면 result5는 1
         */

        double result6 = (double) v1 / v2;
        System.out.println("result6=" + result6);
        /*
        v1 = 5, v2 = 2
        5 / 2 = 2.5 int 타입에선 정수 부분만 저장되지만 하나라도 double 타입을 넣어주면 실수로 저장 가능하다
        따라서 result6은 2.5
         */
    }
}

/*
% 연산자는 나눗셈을 수행한 후 몫이 아닌 나머지를 저장하는 연산자다

산술 연산자의 특징은 피연산자들의 타입이 동일하지 않을 경우 다음과 같은 규칙을 사용해서 피연산자들의 타입을 일치시킨 후 연산을 수행한다는 것이다
1. 피연산자들이 byte, short, char 타입일 경우 모두 int 타입으로 변환 후 연산을 수행한다
   ex - byte + byte -> int + int = int
2. 피연산자들이 모두 정수 타입이고 long 타입이 포함되어 있을 경우 모두 long 타입으로 변환 후 연산을 수행한다
   ex - int + long -> long + long = long
3. 피연산자 중 실수 타입 (float, double) 타입이 있을 경우 허용 범위가 큰 실수 타입으로 변환 후 연산을 수행한다
   ex - int + double -> double + double = double

   그렇다면 다음 연산식은 어떤 값이 저장될까

   int int1 = 10;
   int int2 = 4;
   int result2 = int1 / int2;
   double result3 = int1 / int2;

   int result2에는 2.5가 아닌 정수 부분 2만 저장된다
   int 타입 변수는 소수점 아래 숫자를 저장하지 않는다
   double result3에는 역시 2.5가 아닌 2.0으로 저장된다
   정수가 실수화는 됐지만 int1 / int2 의 산출 값이 2 이기 때문이다

   만약 2.5를 산출 값으로 얻고 싶다면 1.0을 곱하여 실수 타입으로 만든 후 산술 연산을 하거나,
   피 연산자인 int1, int2 중 하나를 double 타입으로 강제 변환 후 산술 연산을 하면 된다
   ex - double result3 = (int1 * 1.0) / int2;
        double result3 = (double) int1 / int2;
        double result3 = int1 / (double) int2;

   ps - chat 타입도 정수 타입이므로 산술 연산이 가능하다
   단 int 타입으로 변환되므로 연산 결과도 int 타입으로 산출된다는 것이다
 */