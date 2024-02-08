package module2.chapter4;

public class Lesson1_Variable {
    int number1= 5;
    static int number2=3;

    class name{
        static String name ="Swan Htet";
        int money=0;

    }

    public void main(String[] args) {
        int i=6;
        System.out.println(i);

        System.out.println(number2);

        Lesson1_Variable lesson= new Lesson1_Variable();
        System.out.println(lesson.number1);

        name n=new name();
        System.out.println(name.name);
    }
}
