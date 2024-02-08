package module1.chapter1.operator;

public class Lesson8UnaryOperator {
    public static void main(String[] args) {
        int a= 7;
        ++a ;
        System.out.println(a);

        System.out.println(++a);

        //a= 9
        System.out.println(a++);
        System.out.println("finnal " + a) ;
        System.out.println(a--);
        System.out.println(a);

        int b=5,c=3;
        System.out.println(c++ - ++b + c--);

        boolean result= b+c > c || c> --b;
        System.out.println(result);

    }
}
