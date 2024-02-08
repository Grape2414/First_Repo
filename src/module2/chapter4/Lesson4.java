package module2.chapter4;

public class Lesson4 {
    public int age;
    public int id;
    String name;
    String color;
    String size;

    public static void main(String[] args) {
        Lesson4 fruit1 = new Lesson4();
        fruit1.name="Apple";
        fruit1.color="Red";
        fruit1.size="small";

        System.out.println(fruit1.name);
        System.out.println(fruit1.color);
        System.out.println(fruit1.size);
        
        Lesson4 fruit2 = new Lesson4();
        fruit2.name="Orange";
        fruit1.color="Yellow";
        fruit2.size="Big";

        System.out.println(fruit2.name);
        System.out.println(fruit2.color);
        System.out.println(fruit2.size);
    }
}
