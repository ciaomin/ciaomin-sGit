package sec03.exam01;

public class RunStatementExample9 {
    public static void main(String[] args) {
        System.out.println("번호\t이경민\t프로그래머\n");
        System.out.println("이스케이프 문자\n");
        System.out.println("출력 연습\n");
        System.out.println("우리는 \"개발자\"입니다");
        System.out.println("봄\\여름\\가을\\겨울");

        /*
        문자열 내부에 역슬래시가 붙은 문자를 사용할 수 있는데, 이것을 '이스케이프 문자'라고 한다
        이스케이프 문자는 문자열 내부에 특정 문자를 포함시킬 수 있다
        예를 들어 큰 따옴표는 문자열 식별 기호인데, 이 큰 따옴표를 데이터로써 사용하고 싶다면 큰 따옴표 앞에 역슬래시를 붙여주면 된다
        또한 이스케이프 문자를 사용하면 출력을 제어 할 수 있다
        탭 크기만큼 간격을 띄우거나 개행 등을 지시할 수 있다

        \t - 탭만큼 띄움
        \n - 줄 바꿈 (라인 피드)
        \r - 캐리지리턴
        \" - " 출력
        \' - ' 출력
        \\ - \ 출력
        역슬래시u16진수 - 16진수 유니코드에 해당하는 문자 출력
         */
    }
}
