package sec03.exam03;

public class ConditionalExample13 {
    public static void main(String[] args) {
        for (int m=2; m<=9; m++) {
            System.out.println("*** " + m + "단 ***");
            /*
            m은 2, m은 9보다 작거나 같다, 해당 식이 실행된 후 m의 값은 1 증가한다
            m이 2에서 9까지 변하는 8번동안 반복
             */
            for (int n=1; n<=9; n++) {
                System.out.println(m + " x " + n + " = " + (m*n));
                /*
            n은 1, n은 9보다 작거나 같다, 해당 식이 실행된 후 n의 값은 1 증가한다
            n이 1에서 9까지 변하는 9번동안 반복
             */

                /*
                5라인의 바깥쪽 for문은 m이 2에서 9까지 변하면서 8번 반복 실행되는데, 바깥쪽 for문이 한 번 실행 될때마다
                7라인의 중첩 for문은 n이 1에서 9까지 변하면서 9번 반복 실행한다
                즉 m=2 일때 n은 1~9까지 변하면서 2xn=2*n 을 출력하게 된다
                 */
            }
        }
    }
}
