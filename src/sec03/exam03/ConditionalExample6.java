package sec03.exam03;

public class ConditionalExample6 {
    public static void main(String[] args) {
        int time = (int) (Math.random() * 4) +8;
        System.out.println("[현재 시각: " + time + " 시");

        switch(time) {
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:
                System.out.println("외근을 나갑니다.");
                /*
                해당 switch문은 break가 없어 산출된 변수 값의 case부터 차례대로 문구가 출력된다

                중간에 break를 넣어주면 break 까지만 case가 차례대로 출력된다
                 */
        }
    }
}
