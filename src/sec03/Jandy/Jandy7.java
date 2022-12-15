package sec03.Jandy;

public class Jandy7 {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
        System.out.println(score + "점은 " + grade + "등급입니다.");

        /*
        스코어가 90점을 넘기면 'A' 등급, 80점을 넘기면 'B' 등급이다
        스코어가 85점이므로 "85점은 B 등급입니다" 출력
         */
    }
}
