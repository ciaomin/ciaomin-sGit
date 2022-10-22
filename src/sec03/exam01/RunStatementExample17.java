package sec03.exam01;

public class RunStatementExample17 {
    public static void main(String[] args) {
        int value = 10 + 2 + 8;
        System.out.println("value: " + value);
        /*
        가장 기본적인 덧셈 연산식
        순서대로 덧셈이 이루어지고 값이 출력된다
         */

        String str1 = 10 + 2 + "8";
        System.out.println("str1: " + str1);
        /*
        덧셈 연산은 순서대로 이루어진다
        10+2가 먼저 계산되고, 뒤에 문자열 8과 합쳐진다
        따라서 답은 12+"8" = 128이다
         */

        String str2 = 10 + "2" + 8;
        System.out.println("str2: " + str2);
        /*
        중간에 있는 문자열도 계산은 순서대로 진행된다
        단 중간에 위치한 "2" 가 문자열이므로 모든 피연산자가 문자열로 인식되고 진행된다
        10+"2"+8 = 102+"8" = 1028
         */

        String str3 = "10" + 2 + 8;
        System.out.println("str3: " + str3);
        /*
        해당 연산은 10이 문자열로 되어있다
        따라서 모든 연산은 문자열로 계산된다
        "10"+2+8 = 102+"8" = 1028
         */

        String str4 = "10" + (2 + 8);
        System.out.println("str4: " + str4);
        /*
        괄호가 있는 연산식은 괄호 안에 있는 계산부터 들어간다
        따라서 "10"+(2+8) = "10"+10 = 1010
         */
    }
}

/*
자바에서 + 연산자는 두 가지 기능을 가직 있다
덧셈 연산을 진행하기도 하고, 피연산자 중 하나가 문자열일 경우, 나머지 피연산자들도 문자열로 자동 변환하여 문자열 결합 연산을 수행한다

ex - 숫자+숫자 -> 덧셈 연산 진행 -> 숫자 값 출력
     "문자열"+숫자 -> "문자열"+"숫자" -> "문자열숫자"
     숫자+"문자열" -> "숫자"+"문자열" -> "숫자문자열"

     ex - int value = 3+7; -> int value = 10;
          String str = "3"+7; -> String str = "37";

          연산식에서 + 연산자가 연속으로 나오면 앞에서부터 순차적으로 + 연산을 수행한다
          먼저 수행된 연산이 덧셈 연산이라면 해당 덧셈 연산의 값을 가지고 다음 + 연산을 수행한다
          만약 먼저 수행된 연산이 결합 연산이라면 이후 + 연산은 모두 결합 연산으로 수행한다

          ex - int value = 1+2+3; -> int value = 3+3; -> int value = 6;
               String str = 1+2+"3" -> String str = 3+"3"; -> String str = "33";
               String str = 1+"2"+3 -> String str = "12"+"3" -> String str = "123";
               String str = "1"+2+3 -> String str = "12"+"3" -> String str = "123";

               ps - 앞에서 순차적으로 + 연산을 수행하지 않고 우선적으로 수행시키고 싶은 연산이 있다면 해당 부분을 괄호()로 감싸준다
               괄호는 최우선적으로 연산을 수행한다

               ex - String str = "1"+(2+3); -> String str = "1"+5 -> String str = "15";
 */