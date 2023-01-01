package sec03.Jandy;

public class Jandy13 {
    public static void main(String[] args) {
        int[] scores = { 83, 90, 87 };

        System.out.println("scores[0] :" + scores[0]);
        System.out.println("scores[1] :" + scores[1]);
        System.out.println("scores[2] :" + scores[2]);

        /*
        int[] scores의 인덱스 값은 0부터 시작된다
        따라서 scores[0]은 83, scores[1]은 90, scores[2]는 87이 출력된다
         */

        int sum = 0;
        for(int i=0; i<3; i++) {
            sum += scores[i];
        }
        System.out.println("총합 :" + sum);

        /*
        int sum = 0;, for(int i=0; i<3; i++)으로 i가 3 미만일 때까지 반복된다
        따라서 i는 0,1,2가 될 수 있다
        sum += scores[i] 이므로 sum += scores[0], sum += scores[1], sum += scores[2]가 될 수 있다
        따라서 총합은 83+90+87=260이다
         */
        double avg = (double) sum / 3;
        System.out.println("평균 :" + avg);
    }
}
