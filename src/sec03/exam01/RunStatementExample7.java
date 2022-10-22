package sec03.exam01;

public class RunStatementExample7 {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';

        char c4 = '가';
        char c5 = 44032;
        char c6 = '\uac00';

        /*
        유니코드로 'A'는 65, char는 문자로 매핑 되어 나타내기 때문에 c1은 그대로 'A'로 나타난다
        c2 또한 코드 같은 이유로 'A'로 나타난다
        c3은 'A'의 유니코드 값을 16진수로 나타낸 것이다 - 0041 =
        0*16의 3제곱 + 0*16의 2제곱 + 4*16의 1제곱 +1*16의 0제곱 =
        0+0+64+1 =
        65
        따라서 c3 또한 'A'로 나타난다

        '가'의 유니코드 값은 44032다
        따라서 c4는 문자 그대로 '가' 로 나타난다

        c5는 '가'의 유니코드 값을 정수로 나타낸 것이다.
        따라서 c5 또한 '가'로 나타난다

        c6은 '가'의 유니코드 값을 16진수로 나타낸 것이다 - ac00 =
        10*16의 3제곱 + 12*16의 2제곱 + 0*16의 1제곱 + 0*16의 0제곱 =
        40960+3072+0+0 =
        44032

        따라서 c6 또한 '가'로 나타난다

        ps - 작은 따옴표로 감싼 문자는 char 타입 변수에 저장되지만 큰 따옴표로 감싼 문자나 여러개의 문자들은 유니코드로 변환되지 않는다
        */

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
    }
}
