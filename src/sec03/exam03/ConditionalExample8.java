package sec03.exam03;

public class ConditionalExample8 {
    public static void main(String[] args) {
        String position = "과장";

        switch(position) {
            case "부장:":
                System.out.println("700만원");
                break;
            case "과장":
                System.out.println("500만원");
                break;
            default:
                System.out.println("300만원");

                /*
                String 타입, 문자열 타입 변수를 이용해 값을 산출한다
                String position에 "과장" 변수 값을 넣었으니 case "과장"의 "500만원" 문구가 출력된다
                 */

        }
    }
}
