package sec03.exam01;

public class RunStatementExample5 {
    public static void main(String[] args) {
        int var1 = 0b1011;
        int var2 = 0206;
        int var3 = 365;
        int var4 = 0xB3;

        /*
        정수 법칙: n진수라면 앞에 있는 숫자*n의 남아있는 자릿수 제곱으로 더한다
        ex - 2진수 -> 0b1011 -> 1*2의 3제곱 + 0*2의 2제곱 + 1*2의 1제곱 + 1*2의 0제곱
        = 8+0+2+1
        =11

        2진수는 0b 또는 0B로 시작하고 0과 1로 구성된다
        8진수는 0으로 시작하고 0~7 숫자로 구성된다
        10진수는 소수점이 없는 0~9 숫자로 구성된다
        16진수는 0x 또는 0X로 시작하고 0~9 숫자와 A,B,C,D,E,F 또는 a,b,c,d,e,f 로 구성된다
        이때 A,B,C,D,E,F 는 각각 10,11,12,13,14,15를 의미한다
         */

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
    }
}
