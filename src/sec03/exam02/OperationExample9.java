package sec03.exam02;

public class OperationExample9 {
    public static void main(String[] args) {
        int charCode = 'A';

        if ( (charCode>=65) & (charCode<=90) ) {
            System.out.println("대문자군요");
            /*
            charCode는 65보다 크거나 작다, 그리고 90보다 작거나 같다
            true 이므로 "대문자군요" 문구 산출
             */
        }

        if( (charCode>=97) && (charCode<=122) ) {
            System.out.println("소문자군요");
            /*
            charCode는 97보다 크거나 같다 - 거짓
            122보다 작거나 같다 - 진실

            하지만 연산식이 &&이므로 문구가 산출되려면 두 피 연산자가 전부 진실이어야 한다
            따라서 문구는 산출되지 않는다
             */
        }

        if( !(charCode<48) && !(charCode>57) ) {
            System.out.println("0~9 숫자군요");
            /*
            chatCode는 48보다 작다 - 거짓
            57보다 크다 - 진실

            하지만 연산식이 &&이므로 문구가 산출되려면 두 피 연산자가 전부 진실이어야 한다
            따라서 문구는 산출되지 않는다
             */
        }

        int value = 6;

        if( (value%2==0) | (value%3==0) ) {
            System.out.println("2 또는 3의 배수군요");

            /*
            value = 6, value%2 = 0 따라서 value%2 == 0 - 진실
            value%3 = 0 따라서 value%3 == 0 - 진실
            |는 하나의 피 연산자라도 true 면 산출이 가능하다
            따라서 문구 산출된다
             */
        }

        if( (value%2==0) || (value%3==0) ) {
            System.out.println("2 또는 3의 배수군요");
            /*
            value = 6, value%2 = 0 따라서 value%2 == 0 - 진실
            value%3 = 0 따라서 value%3 == 0 - 진실
            |는 하나의 피 연산자라도 true 면 산출이 가능하다
            따라서 문구 산출된다
             */
        }
    }
}
