package sec03.exam01;

public class RunStatementExample13 {
    public static void main(String[] args) {
        int intValue = 44032;
        char charValue = (char) intValue;
        System.out.println(charValue);

        long longValue = 500;
        intValue = (int) longValue;
        System.out.println(intValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println(intValue);

        /*
        큰 허용 범위 타입의 변수를 작은 허용 범위 타읍으로 강제로 나눠서 저장하는 것을 강제 타입 변환이라고 한다
        강제 타입 변환은 캐스팅 연산자 괄호 ()를 사용하는데, 괄호 안에 들어가는 타입은 나누는 단위다

        int 타입은 byte 타입보다 큰 허용 범위를 가진다
        따라서 int 타입은 byte 타입으로 자동 변환되지 않는다 하지만 (byte) 캐스팅 연산자 괄호를 통해 byte 타입으로 강제 변환 할 수 있다

        ex - int intValue = 10;
             byte byteValue = (byte) intValue;

             int 타입은 char 타입보다 큰 허용 범위를 가진다
             따라서 자동 변환은 되지 않는다
             char 타입으로 변환하는 이유는 문자를 출력할 수 있기 때문이다

             ex - int intValue = 65:
                  char charValue = (char) intValue;
                  System.out.println(charValue); -> 65가 아닌 "A" 가 출력된다

                  실수 타입 (float, double) 은 정수 타입 (byte, short, int, long) 으로 자동 변환되지 않는다
                  따라서 강제 타입 변환을 사용해야 하는데, 이 경우 소수점 이하 부분은 버려지고 정수 부분만 저장된다

                  ex - double doubleValue = 3.14;
                       int intValue = (int) doubleValue; -> 3.14가 아닌 정수인 3 부분만 저장된다
         */
    }
}
