package sec03.exam03;

public class ConditionalExample10 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1; i<=100; i++) {
            sum +=i;
            /*
            (int i=1; -> 초기화식, i<=100; -> 조건식, i++ -> 증감식)
            i = 1, 100보다 작거나 같다, i++

            sum += i; -> sum = 0+i; i는 1부터 100까지

            ps - System.out.println("1~" + (i-1) + "합 : ' + sum);
            만일 00 라인을 다음과 같이 수정하면 컴파일 에러가 발생한다
            for문의 초기화식에서 선언한 로컬 변수는 for문을 벗어나 사용할 수 없기 때문이다

            단 변수 i를 for문의 초기화식에서 선언하지 않고 for문 전에 선언했다면 for문 내부뿐만 아니라 for문을 벗어나서도 사용할 수 있다
             */
        }

        System.out.println("1~100 합 : " + sum);
    }
}
