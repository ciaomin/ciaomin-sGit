package sec03.exam03;

public class ConditionalExample14 {
    public static void main(String[] args) {
        int i = 1;
        while (i<=10) {
            System.out.println(i);
            i++;
            /*
            해당 예제는 가장 간단한 형태의 while문으로, 1부터 10까지 출력한다
            while문은 한 번 실행할 때 루프 카운터 변수인 i 값을 출력하고 i를 1 증가시킨다
            조건문은 i가 10 이하일 때까지 true가 되므로 while문은 i가 10이 되는 횟수, 즉 총 10번을 반복하게 된다
             */
        }
    }
}
/*
for문이 정해진 횟수만큼 반복한다면, while문은 조건식이 true일 경우 계속 반복한다
조건식에는 비교 또는 논리 연산식이 주로 오는데 조건식이 false가 되면 반복 행위를 멈추고 while문을 종료한다

ex - while (1 조건식) {
             조건식이 true일 경우
            2 실행문;
       }
       1. while문이 처음 실행될 때 조건식 1을 평가한다
       2. 평가 결과가 true이면 실행문 2를 실행한다
       3. 실행문 2가 모두 실행되면 조건식으로 되돌아가서 다시 조건식 1을 평가한다
       4. 만약 조건식이 true라면 [실행문 2 실행 -> 조건식 1로 되돌아가 평가] 이 단계를 조건식 1이 false가 나올 때까지 반복한다
       5. 조건식 1이 false가 나오면 while문을 종료한다
 */