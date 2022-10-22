package sec03.exam03;

public class ConditionalExample5 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;

        switch(num) {
            case 1:
                System.out.println("1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5번이 나왔습니다.");
                break;
            case 6:
                System.out.println("6번이 나왔습니다.");
                break;
        }
    }
}
/*
switch문은 if문과 마찬가지로 조건 제어문입니다
하지만 switch문은 if문처럼 조건식이 true일 경우 블록 내부의 실행문을 실행하는 것이 아니라, 변수가 어떤 값을 갖느냐에 따라 실행문이 선택된다

if문은 조건식의 결과가 true, false 두 가지 밖에 없기 때문에
경우의 수가 많아질수록 else-if를 반복적으로 추가해야 하므로 코드가 복잡해진다는 단점이 있다
그러나 switch문은 변수의 값에 따라 실행문이 결정되기 때문에 같은 기능의 if문보다 코드가 간결하다는 장점이 있다

ex - switch(변수) {
     case 값1:
     실행문 A

     break;
     case 값2:
     실행문 B

     break;
     default:
     실행문 C
  }

  변수가 값1일 경우 case1 로 가서 실행문 A를, 변수가 값2일 경우 case2 로 가서 실행문 B를,
  변수가 값1, 값2 모두 아닐경우 default로 가서 실행문 C를 실행하면 된다

  switch문은 괄호 안의 변수값과 동일한 값을 갖는 case로 가서 실행문을 실행한다
  만약 괄호 안의 변수 값과 동일한 값을 갖ㄱ는 case가 없다면 default로 가서 실행문을 실행한다
  default는 생략 가능하다
 */