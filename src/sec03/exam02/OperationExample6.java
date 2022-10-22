package sec03.exam02;

public class OperationExample6 {
    public static void main(String[] args) {
        String str1 = "Ciao" + 6.0;
        String str2 = str1 + "Holla";
        System.out.println(str2);
        /*
        str1 = "Ciao6.0";
        str2 = "Ciao6.0Holla";
         */

        String str3 = "Ciao" + 3 + 3.0;
        String str4 = 3 + 3.0 + "Ciao";
        System.out.println(str3);
        System.out.println(str4);
        /*
        str3 = "Ciao33.0";
        str4 = "6.0Ciao";
         */
    }
}
