package sec03.exam03;

public class ConditionalExample15 {
    public static void main(String[] args) {
        int sum = 0;

        int i = 1;

        while(i<=100) {
            sum += i;
            i++;
            /*
            0이 sum에 저장, 1이 i에 저장

            while문은 i가 100보다 작거나 같을 때까지

            sum += i -> sum = sum+i -> sum = 0+1 -> sum = 1 -> sum에 1 저장
            i++이므로 i=1+1=2
            System.out.println("1~" + (i-1) + " 합 : " + sum); -> "1~" + (i의 최대값-1) + "합 : " + sum
            -> "1~" + 100 + "합 : " + sum -> "1~100 합 : sum
             */
        }

        System.out.println("1~" + (i-1) + " 합 : " + sum);
    }
}
/*
조건식에는 boolean 타입 변수나 ture/false 값을 산출하는 어떠한 연산식도 올 수 있다
만약 조건식에 true를 사용하면 while (true) {...} 가 되어 무한 루프를 돌게 된다
무한 루프는 말 그대로 무한히 반복 실행이 되기 때문에 언젠가는 while문을 빠져나가기 위한 코드가 필요하다

while문을 종료시키기 위해서는 변수의 값을 false로 만들거나 break문을 이용하는 방법이 있다
 */