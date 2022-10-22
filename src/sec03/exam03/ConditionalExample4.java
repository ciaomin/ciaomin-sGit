package sec03.exam03;

public class ConditionalExample4 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;
        /*
        주사위 숫자를 랜덤으로 뽑는 예제
        먼저 해당 코드 작성을 위해선 정수 난수를 얻는 원리의 이해가 필요하다

        1. 먼저 임의의 정수를 뽑는 방법을 알아야한다
           Math.random() 메소드를 활용할 수 있다
           해당 메소드는 0.0과 1.0 사이에 속하는 double 타입의 난수 하나를 리턴한다
           이때 0.0은 범위에 포함되고 1.0은 포함되지 않는다.
           ex - 0.0 <= Math.random() < 1.0

        2. 그렇다면 1~10 사이의 정수 중 하나의 정수를 얻기 위해 각 변에 10을 곱하면
           다음과 같은 범위에 속하는 하나의 double 타입의 값을 얻을 수 있다
           ex - 0.0 * 10 <= Math.random() * 10 < 1.0 * 10
              -> 0.0 <= (Math.random() * 10) < 10.0

        3. 이 상태에서 각 변을 int 타입으로 강제 타입 변환하면 다음과 같은 범위에 속하는 하나의 정수값을 얻을 수 있다
           ex - (int) 0.0 <= (int) (Math.random() * 10) < (int) 10.0
              -> 0 <= (int) (Math.random() * 10) < 10

        4. 이 상태에서 각 변에 1을 더하면 비로소 1~10 사이의 정수 중에서 하나의 정수를 얻게 된다
           ex - 0 + 1 <= (int) (Math.random() * 10) + 1 < 10 + 1
              -> 1 <= (int) (Math.random() * 10) + 1 < 11

        5. 이 원리를 이용해 start 부터 시작하는 n 개의 정수 중에서 임의의 정수 하나를 얻기 위한 연산식을 다음과 같이 만들 수 있다
           ex - int num = (int) (Math.random() * 6) + start;

           ps - 어쨌든 구하고 싶은 숫자의 최대값을
                int num = (int) (Math.random() * 6) + start; 해당 연산식 Math.random() 메소드 괄호 안에 넣고
                뽑고 싶은 값의 최소값을 start 자리에 넣는다
         */

        if(num==1) {
            System.out.println("1번이 나왔습니다.");
        } else if(num==2) {
            System.out.println("2번이 나왔습니다.");
        } else if(num==3) {
            System.out.println("3번이 나왔습니다.");
        } else if(num==4) {
            System.out.println("4번이 나왔습니다.");
        } else if(num==5) {
            System.out.println("5번이 나왔습니다.");
        } else if(num==6) {
            System.out.println("6번이 나왔습니다.");

            /*
            1부터 6까지 나오는 숫자 중 해당 숫자가 나올때마다 문구 출력
             */
        }
    }
}
