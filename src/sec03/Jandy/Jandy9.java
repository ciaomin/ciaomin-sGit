package sec03.Jandy;

public class Jandy9 {
    public static void main(String[] args) {
        String[] oldStrArray = { "java", "array", "copy" };
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length );

        for(int i=0; i< newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
/*
System.arraycopy() 메소드를 이용해 배열을 복사할 수 있다
System.arraycopy()를 호출하는 방법은 다음과 같다

ex - System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);

src 매개값은 원본 배열이고 srcPos는 원본 배열에서 복사할 항목의 시작 인덱스이다
dest 매개값은 새 배열이고, destPos는 새 배열에서 붙여넣을 시작 인덱스이다
마지막으로 length는 복사할 개수이다
예를 들어 원본 배열이 arr1이고 새 배열이 arr2일 경우 arr1의 모든 항목을 arr2에 복사하려면
다음과 같이 System.arraycopy() 메소드를 호출하면 된다

ex - System.arraycopy(arr1, 0, arr2, 0, arr1.length);
 */

