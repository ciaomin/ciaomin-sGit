package sec03.exam03;

public class ConditionalExample17 {
    public static void main(String[] args) {
        Outter: for(char upper='A'; upper<='Z'; upper++) {
        for(char lower='a'; lower<='z'; lower++) {
            System.out.println(upper + "-" + lower);
            if(lower=='g') {
                break Outter;
                /*
                break문에서 바깥쪽 반복문을 종료시키기 위해 바깥쪽 반복문에 이름을 붙였고,

                 */
            }
        }
        }
        System.out.println("프로그램 실행 종료");
    }
}
