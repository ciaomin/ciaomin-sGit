package sec03.exam04;

public class ReferenceTypesExample {
    public static void main(String[] args) {
        String strVar1 = "이경민";
        String strVar2 = "이경민";

        if(strVar1 == strVar2) {
            /*
            해당 if문은 true, 따라서 "strVar1과 strVar2는 참조가 같음" 문구가 출력
             */
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if(strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
            /*
            strVar1.equals(strVar2) 는 strVar1 = "이경민";, strVar2 = "이경민"; 이므로 true
            따라서 "strVar1과 strVar2는 문자열이 같음" 문구가 출력
             */
        }

        String strVar3 = new String("이경민");
        String strVar4 = new String("이경민");

        if(strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름");
            /*
            String strVa3 == String strVar4 는 동일한 문자열 리터럴로 생성된 객체를 참조하기 때문에 true 이다
            그러나 new String strVar3 == new String strVar4 는 new 연산자로,
            String 객체를 '별도' 로 생성했기 때문에 false 가 나온다

            따라서 "strVar3과 strVar4는 참조가 다름" 문구가 출력
            */
        }

        if(strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4는 문자열이 같음");
            /*
            동일한 String 객체이건 다른 객체이건 상관없이 내부 문자열을 비교하고 싶을 때에는 String 객체의 equals() 메소드를
            사용해야 한다
            equals() 메소드는 원본 문자열과 매개값으로 주어진 비교 문자열이 동일한지 비교한 후 true 또는 false 를 리턴한다

            해당 if문은 true 이므로 "strVar3과 strVar4는 문자열이 같음" 문구가 출력
             */
        }
    }
}
/*
사실 문자열을 String 변수에 저장한다는 말은 틀린 표현이다
문자열이 직접 변수에 저장되는 것이 아니라 문자열은 String 객체로 생성되고 변수는 String 객체를 참조하는 것이기 때문이다

하지만 일반적으로 String 변수에 저장한다고 표현한다
다만 해당 부분은 정확히 인지하고 있을 필요가 있다

참조는 쉽게 말해 링크가 저장되는 것이다 해당 변수의 값이 아닌 그 변수의 값이 있는 곳으로의 링크

기본 타입의 변수의 ==, != 연산은 변수의 값이 같은지, 아닌지를 조사하지만
참조 타입 변수들 간의 ==, != 연산은 동일한 객체를 참조하는지, 다른 객체를 참조하는지 알아볼 때 사용된다
참조 타입 변수의 값은 힙 영역의 객체 주소이므로 ==, != 연산은 결국 번지 값을 비교하는 것이 된다
동일한 번지 값을 갖고 있다는 것은 동일한 객체를 참조한다는 의미이다
따라서 동일한 객체를 참조하고 있을 경우 ==는 true, !=는 false가 된다

참조 타입 변수는 힙 영역의 객체를 참조하지 않는다는 뜻으로 null 값을 가질 수 있다
null 값도 초기값으로 사용할 수 있기 때문에 null로 초기화된 참조 변수는 스택 영역에 생성된다

참조 타입 변수가 null 값을 가지는지 확인 하려면 다음과 같이 ==, != 값을 수행하면 된다
ex - refVar1 == null
     refVar1 != null

     refVar1의 null 값 보유 여부에 따라 true나 false로 실행된다
 */