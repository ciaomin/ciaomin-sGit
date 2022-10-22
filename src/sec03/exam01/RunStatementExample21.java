package sec03.exam01;

public class RunStatementExample21 {
    public static void main(String[] args) throws Exception {
        int keyCode;

        while(true) {
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
        }
    }
}
