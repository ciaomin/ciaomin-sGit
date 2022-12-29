package sec03.Jandy;

public class Jandy12 {

    public static void main(String[] args) {
        int[] scores = { 95, 71, 84, 93, 87 };

        int sum = 0;
        for (int score : scores) {
            sum = sum + score;
        }
        System.out.println("점수 총합 = " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);
    }
}
/*
자바는 배열이나 컬렉션을 좀 더 쉽게 처리하기 위해 향상된 for문을 제공한다
향상된 for문은 반복 실행을 하기 위해 루프 카운터 변수와 증감식을 사용하지 않는다
for문의 괄호 ()에는 배열에서 꺼낸 항목을 저장할 변수 선언과 콜론(:), 그리고 배열을 나란히 작성한다
배열 및 컬렉션 항목의 개수만큼 반복하고, 자동적으로 for문을 빠져나간다

ex - for ( 2번 타입 변수 : 1번 배열 ) {
              3번 실행문;
}

     1. for문이 처음 실행 될 때 배열 1번에서 가져올 첫 번째 값이 존재하는지 평가
     2. 가져올 값이 존재하면 해당 값을 변수 2번에 저장
     3. 실행문 3번을 실행
     4. 블록 내부의 실행문 3번이 모두 실행되면 다시 루프를 돌아 배열 1번에서 가져올 다음 값이 존재하는지 평가
     5. 만약 다음 항목이 존재한다면 2 -> 3 -> 1 순서대로 루프를 다시 진행하고, 가져올 다음 항목이 없다면 for문이 종료

      따라서 for문의 반복 횟수는 배열의 항목 수가 된다
 */

