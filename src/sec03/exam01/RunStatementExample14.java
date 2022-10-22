package sec03.exam01;

public class RunStatementExample14 {
    public static void main(String[] args) {
        byte result1 = 10 + 20;
                System.out.println(result1);

                byte x = 10;
                byte y = 20;
                int result2 = x + y;
                System.out.println(result2);

                /*
                정수 타입의 변수가 산술 연산식에서 피연산자로 사용되면,
                int 타입보다 작은 byte, short 타입의 변수는 int 타입으로 자동 타입 변환되어 연산을 수행한다

                ex - byte x = 10;
                     byte y = 20;
                     byte result = x + Y; -> 이렇게 되면 컴파일 에러가 난다
                     int result = x + y; -> 이렇게 int 타입으로 코드를 작성해야 정상 컴파일 된다
                     short 도 마찬가지다

                     타입 변환이 적을 수록 실행 성능은 향상된다 그렇다면 최대한 타입 변환을 줄이는 것도 고성능을 위한 방법이 될 수 있다

                     ps - 정수 연산식에서 모든 변수가 int 타입으로 변환되는 것은 아니다 두 피연산자 중 허용 범위가 큰 타입으로 변환 되는것이다
                 */
    }
}
