package sec03.exam03;

public class ConditionalExample12 {
    public static void main(String[] args) {
        for(float x=0.1f; x<=1.0f; x+=0.1f) {
            System.out.println(x);

            /*
            다음 예를 보면 이론적으로 5라인의 for문은 10번 반복해야 한다
            하지만 0.1은 float 타입으로 정확하게 표현할 수 없기 때문에 루프 카운터 변수 x에 더해지는 실제 값은 0.1보다 약간 크다
            결국 루프는 9번만 실행된다
             */
        }
    }
}
