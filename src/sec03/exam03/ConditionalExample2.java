package sec03.exam03;

public class ConditionalExample2 {
    public static void main(String[] args) {
        int score = 85;

        if(score>=90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다");
        } else {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");

            /*
            int score = 85;

            따라서 if(score>=90) 는 거짓이다

            그러므로 else 블록이 발동, "점수가 90보다 작습니다.", "등급은 B입니다." 문구가 출력된다

            if문과 else 블록에 중괄호 부호 추가 하는 것 잊지 말자
             */
        }
    }
}
