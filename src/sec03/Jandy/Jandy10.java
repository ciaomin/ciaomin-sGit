package sec03.Jandy;

public class Jandy10 {
    public static void main(String[] args) {
        int[] scores = {83, 90, 87};

        int sum = 0;
        for(int i=0; i<scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합 :" + sum);
        /*
        i<scores.length; 에서 scores.length의 값은 3이다
        int scores = {83, 90, 87} 로 배열의 길이가 3이기 때문이다

        따라서 sum은 83+90+87 = 260, "총합 : 260" 문구가 출력된다
         */

        double avg = (double) sum / scores.length;
        System.out.println("평균 : " + avg);
        /*
        double 타입으로 소수점까지 나타낼 수 있음
        (double) sum / scores.length; = 260.0 / 3 = 86.66666666666667
        따라서 "평균 : 86.66666666666667" 문구가 출력된다
         */
    }
}
