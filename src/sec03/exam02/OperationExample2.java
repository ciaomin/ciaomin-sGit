package sec03.exam02;

public class OperationExample2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("----------");
        x++;
        ++x;
        System.out.println("x=" + x);
        /*
        int x = 10, x++ = 11, ++x = ++11 = 12
        따라서 답은 12
         */

        System.out.println("----------");
        y--;
        --y;
        System.out.println("y=" + y);
        /*
        int y = 10, y-- = 9, --y = --9 = 8
        따라서 답은 8
         */

        System.out.println("----------");
        z = x++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        /*
        int z = x++ = 12++ = 12
        x = 12+1 = 13
        ++가 x 변수 값 뒤에 붙었으므로 연산이 끝난 후 변수 x에 1이 증가된다
        따라서 z는 x 값이었던 12가 되고 x는 ++의 증감을 받아 13이 된다
         */

        System.out.println("----------");
        z = ++x;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        /*
        z = ++x = ++13 = 14
        x = 14
        ++가 x 변수 값 앞에 붙었으므로 연산 전에 변수 값 x에 1이 증가된다
        따라서 z는 x가 증가한 값인 14, x 또한 ++의 증가를 받아 14가 된다
         */

        System.out.println("----------");
        z = ++x + y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        /*
        z = ++x + y++
          = ++14 + y++
          = 15 + 8++
          = 23
        x = 15
        y = 9
        ++가 x 변수 값 앞에 붙었고 y 변수 값에는 뒤에 붙었다
        따라서 z = ++14 + 8 = 15 + 8 = 23 이다
        거기에 x는 15로 값이 저장되고 연산이 모두 끝난 후 기존 y 값에 1 증가되어 y 값은 9로 바뀐다
         */
    }
}

/*
단항일때는 증감 연산자의 위치는 상관 없다
하지만 다른 연산자와 함께 사용된다면 증감 연산자의 위치에 따라 값이 다르게 나오므로 주의해야 한다

증감 연산자가 변수 앞에 있으면 우선 변수 값을 1 증가 또는 감소시킨 후 다른 연산자를 처리한다
반면 증감 연산자가 변수 뒤에 있으면 다른 연산자를 먼저 처리한 후 변수 값을 1 증가 또는 감소시킨다
ex - int x = 1;
     int y = 1;
     int result1 = ++x + 10;
     int result2 = y++ + 10;

     이렇게 되면 변수 result1에는 12가 저장된다
     변수 x 앞에 ++가 붙어 x의 값이 1 증가 되고나서 + 10 연산이 들어가 2+10=12 가 됐기 때문이다

     변수 result2에는 11이 저장된다
     변수 y 뒤에 ++가 붙었으므로 연산 당시 y 값은 증가하지 않고 그대로 1이다
     따라서 y++ + 10 = 1 + 10 = 11 이다
     이후 연산 종료 후 y 값은 ++의 증가를 받아 2가 된다
 */