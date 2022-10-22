package sec03.exam01;

public class RunStatementExample18 {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");
        /*
        위 연산은 각각의 "문자열"을 기본 타입으로 변환하는 연산식이다

        각각 문자열 "10", "3.14", "true" 의 문자열을 int, double, boolean 타입으로 바꿨다
         */

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " + value3);

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);
        /*
        위 연산식은 반대로 기본 타입의 값을 문자열로 변환하는 메소드다
        해당 연산식을 통해 10, 3.14, true는 모두 문자열로 출력된다
         */

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

    }
}
