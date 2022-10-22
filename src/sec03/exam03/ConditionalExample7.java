package sec03.exam03;

public class ConditionalExample7 {
    public static void main(String[] args) {
        char grade = 'B';

        switch(grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");
            break;
            case 'B':
            case 'b':
                System.out.println("일반 회원입니다.");
            break;
            default:
                System.out.println("손님입니다.");

                /*
                char 타입 변수는 알파벳 대소문자에 관계없이 동일하게 처리하도록 만든다
                따라서 case 'B', case'b' 모두 해당 되며 이에 "일반 회원입니다." 문구가 출력된다
                 */
        }

    }
}
