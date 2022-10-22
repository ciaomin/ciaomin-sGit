package sec03.exam03;

public class ConditionalExample18 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            if(i%2 != 0) {
                continue;
                /*
                6라인은 2로 나눈 나머지가 0이 아닌 경우, 즉 홀수인 경우를 뜻한다
                 */
            }
            System.out.println(i);
            /*
            따라서 홀수는 실행되지 않는다
            따라서 2, 4, 6, 8, 10이 출력된다
             */
        }
    }
}

/*
continue문은 반복문인 for문, while문, do-while문에서만 사용된다
블록 내부에서 continue문이 실행되면 for문의 증감식 또는 while문, do-while문의 조건식으로 이동한다

ex - for (...) {             ex2 - while (...) {

     continue;                      continue;

  }                            }

  continue문은 반복문을 종료하지 않고 계속 반복을 수행한다는 점이 break문과 다르다
  break문과 마찬가지로 continue문도 대개 if문과 같이 사용되는데,
  특정 조건을 만족하는 경우에 continue문을 실행해서 그 이후의 문장을 실행하지 않고 다음 반복으로 넘어갑니다
 */