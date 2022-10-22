package sec03.exam01;

public class RunStatementExample22 {
    public static void main(String[] args) throws Exception {
        int keyCode;

        while(true) {
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
            if(keyCode == 113) {
                break;
            }
        }

        System.out.println("종료");
    }
}
/*
System.in.read() 의 단점은 키코드를 하나씩 읽기 때문에 2개 이상의 키가 조합된 한글을 읽을 수 없다는 것이다
그리고 키보드로부터 입력된 내용을 통 문자열로 읽지 못한다
이런 단점을 보완하기 위해 자바는 Scanner 클래스를 제공하고 있다

ex - Scanner scanner = new Scanner(System.in);
     [scanner 변수 선언]      [시스템의 입력 장치로부터 읽는 scanner 생성]
     String inputData = scanner.nextLine();
     [string 변수 선언]    [enter 키 이전까지 입력된 문자열을 읽음]
 */