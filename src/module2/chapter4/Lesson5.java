package module2.chapter4;

public class Lesson5 {
    int id;

    String name;

    int age;

    static String schoolname= "Swan";

    public static void main(String[] args) {
        Lesson4 student1 =new Lesson4();
        student1.id=1;
        student1.name="Swan Htet";
        student1.age = 21;

        System.out.println(student1.id);
        System.out.println(student1.name);
        System.out.println(student1.age);

    }
}
