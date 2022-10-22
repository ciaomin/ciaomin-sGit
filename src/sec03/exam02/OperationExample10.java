package sec03.exam02;

public class OperationExample10 {
    public static void main(String[] args) {
        int result = 0;
        result += 10;
        /*
        +=는 변수 = 변수+피 연산자와 동일
        따라서 result += 10 -> 10
        따라서 result = 10
         */
        System.out.println("result=" + result);
        result -= 5;
        /*
        -=는 변수 = 변수 - 피 연산자와 동일
        따라서 result -= 5 ->
        result = 10 - 5 = 5
         */
        System.out.println("result=" + result);
        result *= 3;
        /*
        *=는 변수 = 변수 * 피 연산자와 동일
        따라서 result *= 3 ->
        result = 5 * 3 = 15
         */
        System.out.println("result=" + result);
        result /= 5;
        /*
        /=는 변수 = 변수 / 피 연산자와 동일
        따라서 result /= 5 ->
        result = 15 / 5 = 3
         */
        System.out.println("result=" + result);
        result %= 3;
        /*
        %=는 변수 = 변수 % 피 연산자와 동일
        따라서 result %= 3; ->
        result %= 3 % 3 = 0
         */
        System.out.println("result=" + result);
    }
}
