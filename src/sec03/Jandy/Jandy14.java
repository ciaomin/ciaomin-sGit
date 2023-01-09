package sec03.Jandy;

public class Jandy14 {
    public static void main(String[] args) {
        sec03.exam5.Person kimcoding = new sec03.exam5.Person("김코딩", "프로그래머", 30);
        sec03.exam5.Person nahacker = new sec03.exam5.Person("나해커", "해커", 32, true);

        int age = kimcoding.getAge();
        System.out.println("김코딩의 나이는 " + age + "살 입니다.");
    }
}

class Person {
    private String name;
    private String occupation;
    private int age;
    private boolean isSingle;

    Person(){
        System.out.println("첫 번째 생성자");
    };

    Person(String name, String occupation, int age) {
        this(name, occupation, age, false);
        System.out.println("두 번째 생성자");
    }

    Person(String name, String occupation, int age, boolean isSingle) {
        System.out.println("세 번째 생성자");
        this.name = name;
        this.occupation = occupation;
        this.age = age;
        this.isSingle = isSingle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

