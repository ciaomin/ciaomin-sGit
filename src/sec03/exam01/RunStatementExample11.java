package sec03.exam01;

public class RunStatementExample11 {
    public static void main(String[] args){
        boolean stop = false;
        if(stop) {
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");

            /*
            boolean stop의 값을 true로 설정 해놨음
            if는 설정한 값이 true 일 시에 출력, else는 false 일 경우에 출력 됨
            해당 코드 같은 경우엔 true로 설정됐기 때문에 if 출력문이 출력 됨
            boolean stop의 값을 false로 바꾸면 else 출력문이 출력 됨
             */
        }
    }
}
