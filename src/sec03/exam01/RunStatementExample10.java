package sec03.exam01;

public class RunStatementExample10 {
    public static void main(String[] args) {

        float var2 = 3.14f;
        double var3 = 3.14;


        float var4 = 0.1234567890123456789f;
        double var5 = 0.1234567890123456789;

        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);
/*
float은 double 보다 나타낼 수 있는 범위가 적다 (float은 소수점 아래 7자리까지, double은 15자리까지)
따라서 double이 조금 더 정확한 데이터 저장이 가능하다
 */

        double var6 = 3e6;
        float var7 = 3e6F;
        double var8 = 2e-3;
        System.out.println("var6: " + var6);
        System.out.println("var7: " + var7);
        System.out.println("var8: " + var8);

        /*
        소스 코드에서 소수점이 있는 숫자 리터럴은 10진수 실수로 인식한다
        또한 알파벳 소문자 e나 대문자 E가 포함된 숫자 리터럴은 지수와 가수로 표현된 소수점이 있는 10진수 실수로 인식한다
        ex - 5e2 = 5.0*10의 2제곱 = 500.0
           - 0.12E-2 = 0.12*0.0012
           앞의 있는 숫자*10의 n (n은 알파벳 e뒤에 있는 숫자) 제곱으로 계산한다
         */
    }
}
