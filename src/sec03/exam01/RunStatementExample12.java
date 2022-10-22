package sec03.exam01;

public class RunStatementExample12 {
    public static void main(String[] args) {

        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue: " + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드: " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue: " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue: " + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue: " + doubleValue);

        /*
        타입 변환이란 데이터 타입을 다른 데이터 타입으로 변환 하는 것을 지칭한다
        두 변수의 타입이 동일하다면 한 쪽 변수 값을 다른 쪽 변수에 저장할 수 있다 만약 두 변수의 타입이 다르면 해당 코드를 이용하면 된다

        ex - byte a = 10; - byte 타입 변수 a에 10을 저장
             int b = a; - byte 타입 변수 a에 저장된 10을 int 타입 변수 b에 복사해서 저장

             자동 타입 변환은 말 그대로 자동으로 타입 변환이 일어나는 것을 말한다
             자동 타입 변환은 값의 허용 범위가 작은 타입이 허용 범위가 보다 큰 타입으로 저장될 때 발생한다

             기본 타입의 허용 범위 크기 순은 다음과 같다
             byte < short <int < long < float < double

             ex - byte byteValue = 10;
                  int intValue = byteValue;

                  해당 코드 같은 경우 int가 byte 보다 허용 범위가 크기 때문에 자동으로 타입 변환이 일어난다

                  char 타입의 경우, int 타입으로 자동 변환되면 유니코드 값이 int 타입에 저장된다

                  ex - char charValue = 'A';
                       int intValue = charValue; (유니코드 값인 65가 저장됨)

                       ps - char 타입보다 허용 범위가 작은 byte 타입은 chr 타입으로 자동 변환 될 수 없다
                       char 타입은 음수를 허용하지 않는데 byte 타입은 음수를 포함하고 있기 때문이다
         */
    }
}
