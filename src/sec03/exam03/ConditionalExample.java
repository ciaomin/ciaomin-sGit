package sec03.exam03;

public class ConditionalExample {
    public static void main(String[] args) {
        int score = 93;

        if(score>=90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");

            /*
            int score = 93;
            따라서 if(score>=90)은 true, "점수가 90보다 큽니다." 와 "등급은 A입니다." 문구는 정상 출력된다
             */
        }

        if(score<90)
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
            /*
            int score = 93; 이므로 if(score<90)은 false, "점수가 90보다 작습니다." 문구는 출력되지 않는다

            19라인의 "등급은 B입니다." 문구는 if문과 상관없이 정상 출력된다
            17라인의 if문에는 중괄호 블록이 없어 13라인까지만 영향을 미치며,
            따라서 14라인은 들여쓰기만 됐을뿐, 17라인의 if문과는 아무 관련이 없기 때문이다
             */
    }
}

/*
if문은 else 블록과 함께 사용되어 조건식의 결과에 따라 실행 블록을 선택한다
if문의 조건식이 true면 if문의 블록이 실행되고 조건식이 false면 else 블록이 실행된다
조건식의 결과에 따라 이 2개의 블록 중 어느 한 블록의 내용만 실행하고 전체 if문을 벗어나게 된다

ex - if(조건식) {
     실행문A

  }  else {
     살행문B
  }
     실행문C

     1. 조건식이 true이면 실행문 A -> 실행문 C 실행
     2. 조건식이 false이면 실행문 B -> 실행문 C 실행
 */