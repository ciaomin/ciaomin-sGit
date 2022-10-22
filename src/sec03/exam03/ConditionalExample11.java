package sec03.exam03;

public class ConditionalExample11 {
    public static void main(String[] args) {
        int sum = 0;

        int i = 0;
        for(i=1; i<=100; i++) {
            sum += i;
        }

        System.out.println("1~" + (i-1) + "합 : " + sum);

        /*
        문자열 +를 유의해야 한다
        for(i=1; i<=100; i++) 으로 i는 101이 됐다
        따라서 "1~"+100+"합:"+sum
        -> "1~100합: 5050"이 출력된다

        변수 i를 for문의 초기화식에서 선언하지 않고 for문 전에 선언했으므로 for문 내부와 외부에서 사용이 가능했다

        ps - for문을 작성할 때 주의할 점은 초기화 식에서 루프 카운터 변수를 선언할 때
        부동 소수점을 쓰는 float 타입을 사용하지 말아야 한다는 것이다
         */
    }
}
