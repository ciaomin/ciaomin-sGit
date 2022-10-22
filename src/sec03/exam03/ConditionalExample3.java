package sec03.exam03;

public class ConditionalExample3 {
    public static void main(String[] args) {
        int score = 75;

        if(score>=90) {
            System.out.println("점수가 100~90입니다.");
            System.out.println("등급은 A입니다.");
            /*
            int score = 75;
            따라서 7라인의 if문은 false, 문구 출력 되지 않는다
             */
        } else if(score>=80) {
            System.out.println("점수가 80~89입니다.");
            System.out.println("등급은 B입니다.");
            /*
            7라인의 if문의 false이므로 else if문인 14라인으로 넘어왔다
            하지만 해당 조건식 또한 false이므로 문구 출력되지 않는다
            다음 else if문인 22라인으로 넘어간다
             */
        } else if(score>=70) {
            System.out.println("점수가 70~79입니다.");
            System.out.println("등급은 C입니다.");
            /*
            22라인의 else if문은 true이다
            따라서 해당 조건식의 실행문, 즉 문구가 출력된다
             */
        } else {
            System.out.println("점수가 70 미만입니다.");
            System.out.println("등급은 D입니다.");
            /*
            앞선 22라인의 조건식이 true이므로 29라인의 else 블록은 작동하지 않는다
             */
        }
    }
}
/*
if문 중엔 ㅈ건문이 여러 개인 것도 있다
처음 if문의 조건식이 false일 경우 다른 조건식의 결과에 따라 실행 블록을 선택할 수 있는데,
if 블록의 끝에 else if문을 붙이면 된다
else if문의 수는 제한이 없으며, 여러 개의 조건식 중 true가 되는 블록만 실행하고 전체 if문을 벗어나게 된다
else if 블록의 마지막에는 else 블록을 추가할 수 있는데, 모든 조건식이 false일 경우 else블록을 실행하고 if문을 벗어나게 된다

ex - if (조건식1) {
        실행문A

   } else if (조건식2) {
        실행문B
   } else {
     실행문C
   }
      실행문D

      1. 조건식1이 true이면 실행문A -> 실행문D 실행
      2. 조건식1이 false이면 조건식2로 이동
      3. 조건식2가 true이면 실행문B -> 실행문D 실헹
      4. 조건식2가 false이면 실행문C -> 실행문D 실행

 */