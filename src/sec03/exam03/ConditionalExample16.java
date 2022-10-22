package sec03.exam03;

public class ConditionalExample16 {
    public static void main(String[] args) {
        while(true) {
            int num = (int) (Math.random() * 6) + 1;
            System.out.println(num);
            if(num == 6) {
                break;
            }
        }
        System.out.println("프로그램 종료");
        /*
        while문에 6이 나오면 종료 할 수 있는 코드를 넣어놓으면 6이 나올때까지 계속 반복하다가 6이 나오면 while문이 종료 된다
         */
    }
}
/*
do-while문은 조건식에 의해 반복 실행한다는 점에서는 while문과 동일하다
while문은 시작할 때부터 조건식을 검사하여 블록 내부를 실행할지 결정하지만
경우에 따라서는 블록 내부의 실행문을 우선 실행하고 실행결과에 따라서 반복 실행을 계속할지 결정할 수도 있다

이따 do-while문을 사용할 수 있다 (do-while문은 블록 내부의 실행문을 우선 실행하고 실행 겨로가에 따라 반복 실행을 계속 할지를 결정한다)
ex - do {

              1 실행문;

      } while (2 조건식);

      1. do-while문이 처음 실행될 때 실행문 1을 우선 실행한다
      2. 실행문 1이 모두 실행되면 조건식 2를 평가한다
      3. 조건식의 결과가 true이면 [실행문 1 실행 -> 조건식 2 평가] 해당 과정을 false가 될 때까지 반복한다
      4. 조건식의 결과가 false이면 do-while문을 종료한다

      break문

      break문은 반복문인 for문, while문, do-while문의 실행을 중지할 때 사용된다
      또한 switch문에서도 break문을 사용해 실행을 중지시킨다

      만약 반복문이 중첩되어 있을 경우 break문은 가장 가까운 반복문만 종료하고 바깥쪽 반복문은 종료하지 않는다
      중첩된 반복문에서 바깥쪽 반복문까지 종료시키려면 바깥쪽 반복문에 이름(라벨)을 붙이고 'break 이름;'을 사용하면 된다

      ex 1 - for (...) {                 ex 2 - Label: for (...) {

           for(...) {                            for(...) {
           break;                                break Label;

       }                                         ]

     }                                         }
 */