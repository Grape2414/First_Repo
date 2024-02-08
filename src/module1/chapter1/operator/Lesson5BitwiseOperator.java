package module1.chapter1.operator;

public class Lesson5BitwiseOperator {
    public static void main(String[] args) {

        boolean result1 = true & true;
        System.out.println(result1);
        boolean result5 = true & false;
        System.out.println(result5);

        boolean result2 = false | false;
        System.out.println(result2);
        boolean result4 = false | true;
        System.out.println(result4);

        boolean result3 = true ^ true;
        System.out.println(result3);
        boolean result6 = true ^ false;
        System.out.println(result6);

        System.out.println( 7 ^ 15);
    }
}
