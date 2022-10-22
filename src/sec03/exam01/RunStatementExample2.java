package sec03.exam01;

public class RunStatementExample2 {
    public static void main(String[] args) {
        int x = 5;
        x = x + 1;// 6
        x = x * x;// 36
        if (false)
            System.out.println("x is 36");
        else
            System.out.println("x is not 36");
        int y = 2;
        int result = x * y;
        System.out.println(result);

        /*
        각각의 변수에 값을 저장하고 +,*,- 등을 사용해 값을 구할 수 있다
         */
    }
}
