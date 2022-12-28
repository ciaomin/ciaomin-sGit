package sec03.Jandy;

import java.util.Scanner;

public class Jandy11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //- System.in을 사용하여 키보드 입력 값을 읽고 원하는 타입으로 변환하여 리턴한다.

        System.out.println("첫번째 숫자를 입력하세요"); // "첫번째 숫자를 입력하세요" 문구 출력 이후 숫자를 입력하면
        // String str1 = scan.nextLine();에 첫 숫자 입력
        String str1 = scan.nextLine();

        System.out.println("사칙연산 기호중 하나를 입력하세요"); // "사칙연산 기호중 하나를 입력하세요" 문구 출력 이후 사칙연산을 입력하면
        // String op = scan.nextLine();에 연산 입력
        String op = scan.nextLine();

        System.out.println("두번째 숫자를 입력하세요"); // "첫번째 숫자를 입력하세요" 문구 출력 이후 숫자를 입력하면
        // String str1 = scan.nextLine();에 첫 숫자 입력
        String str2 = scan.nextLine();

        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);
        double num3;

        if(op.equals("+")) {
            num3 = num1 + num2;
        }
        else if(op.equals("-")) {
            num3 = num1 - num2;
        }
        else if(op.equals("/")) {
            num3 = num1 / num2;
        }
        else{
            num3 = num1 * num2;
        }

        System.out.println(str1 + op + str2 + "=" + num3);
    }
}
