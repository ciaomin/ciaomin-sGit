package sec03.Jandy;

public class Jandy8 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = new int[a.length];
        int[] c = a;
        /*
        a 배열 생성 / b는 for문을 통한 깊은 복사 / c는 얕은 복사를 진행했다
         */

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        a[0] = 10000;
        /*
        a[0]의 값을 10000으로 임의 변경
         */
        System.out.println("b는 깊은 복사를 했으니까 b[0] = " + b[0]);
        /*
        b는 깊은 복사를 했으므로 a[0]의 값이 변경 된다 해도 영향을 받지 않는다
        그대로 1이 출력된다
         */
        for (int x : b) System.out.print(x + " ");
        /*
        b는 깊은 복사를 했으므로 a[0]의 값이 변경된다 해도 영향을 받지 않는다
        그대로 { 1, 2, 3,  4 }가 출력된다
         */
        System.out.println();
        System.out.println("c는 얕은 복사를 했으니까 c[0]= " + c[0]);
        /*
        c는 얕은 복사를 했으므로 a[0]의 값이 변경되면 영향을 받는다
        따라서 변경된 값인 10000이 출력된다
         */
        for (int x : c) System.out.print(x + " ");
        /*
        c는 얕은 복사를 했으므로 a[0]의 값이 변경되면 영향을 받는다
        변경된 10000을 적용해 { 10000, 2, 3, 4 }가 출력된다
         */

        System.out.println();
        System.out.println();
        System.out.println("원래 배열 a의 주소값 = " + a);
        System.out.println("얕은 복사 c의 주소값 = " + c);
        System.out.println("깊은 복사 b의 주소값 = " + b);
        /*
        첫 번째 출력은 기존 배열인 a의 주소값이 출력된다
        두 번째 출력은 얕은 복사의 c의 주소값이 출력된다 - a와 같은 주소값이 출력된다
        세 번째 출력은 깊은 복사의 b의 주소값이 출력된다 - a와는 다른 주소값이 출력된다
         */

    }
}

