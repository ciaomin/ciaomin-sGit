package sec03.exam02;

public class OperationExample5 {
    public static void main(String[] args) {
        char c1 = 'A' + 1;
        char c2 = 'A';
        char c3 = (char) (c2 + 1);
        /*
        char c3 = c2 + 1; 로 진행하면 c2는 int 타입으로 변환되고 1과 연산되기 때문에 연산 결과는 int가 된다
        그러나 저장은 char 타입인 c3에 저장되므로 컴파일 에러가 발생한다
        따라서 char 타입으로 강제 변환을 해야 한다
         */
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
    }
}
