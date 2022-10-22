package sec03.exam02;

public class OperationExample3 {
    public static void main(String[] args) {
        boolean play = true;
        System.out.println(play);
        /*
        true 값을 설정 했으니 그대로 true 출력 및 저장
         */

        play = !play;
        System.out.println(play);
        /*
        ! 연산자로 논리 부정 넣었으니 false로 출력 및 저장
         */

        play = !play;
        System.out.println(play);
        /*
        false로 저장된 상태에서 다시 한번 ! 연산자로 논리 부정 넣었으니 true로 출력 및 저장
         */
    }
}
