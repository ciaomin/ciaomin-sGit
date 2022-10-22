package sec03.exam01;

public class RunStatementExample15 {
    public static void main(String[] args) {
        byte value1 = 10;
        short value2 = 15;
        int value3 = 100;
        long value4 = 1000L;
        long result = value1 + value2 + value3 + value4;
        System.out.println(result);

        /*
        해당 예제는 앞서 예시로 들었던 int 타입뿐만이 아닌 더 큰 허용 범위의 타입이 있다면 그 타입보다 허용 범위가 작은 타입의 연산자들은
        변환된다는 것을 나타낸다

        byte, short, int 모두 long 보다 작은 타입의 변수로 result 를 long 타입으로 코드를 넣어야 답이 정상적으로 출력된다
         */
    }
}
