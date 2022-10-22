package sec03.exam01;

public class RunStatementExample16 {
    public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        /*
        byte byteValue3 = byteValue1 + byteValue2; -> 이렇게 넣으면 컴파일 에러가 뜬다
        최소 short 타입으로 변환해야 한다
         */
        int intValue1 = byteValue1 + byteValue2;
        System.out.println(intValue1);


        char charValue1 = 'A';
        char charValue2 = 1;
        /*
        char charValue3 = charValue1 + charValue2; -> 컴파일 에러가 난다
        int 타입으로 변환 해주자
         */
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드=" + intValue2);
        System.out.println("출력문자=" + (char)intValue2);
        /*
        char 타입으로 변환하면 문자를 출력할 수 있다
        따라서 char 타입으로 강제 변환 후 값을 출력하면 유니코드 66의 알파벳인 B가 출력된다
         */

        int intValue3 = 10;
        int intValue4 = intValue3/4;
        System.out.println(intValue4);
        /*
        해당 연산은 intValue3을 4로 나눈 값을 구하는 것이다
        다만 소수점 이하 숫자는 취급하지 않으므로 2.5가 아니라 2로 출력된다
         */

        int intValue5 = 10;
        double doubleValue = intValue5 / 4.0;
        System.out.println(doubleValue);
        /*
        double 타입의 변수는 소수점 아래 숫자도 출력된다
        따라서 10 / 4 = 2.5
         */

        int x = 1;
        int y = 2;
        double result = (double) x / y;
        System.out.println(result);
        /*
        자바에서 정수 연산의 값은 무조건 정수로 나온다
        소수점 아래의 숫자도 나타내고 싶을 때 x와 y를 double 타입으로 변환해 답을 구한다
         */
    }
}
