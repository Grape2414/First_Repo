package module2.chapter4;

public class Lesson3_ObjectIntialization {
    public static void main(String[] args) {
        int i = 5;
        Lesson1_Variable obj = new Lesson1_Variable();
        obj.number1 =9;

        Alien alie= new Alien();
        alie.name ="Mars";
        alie.age= 43;

        System.out.println(alie.name);
        System.out.println(alie.age);
    }
}
class  Alien{
    String name= "Pluto";
    int age = 32;
}