package module1.chapter1.operator;

public class Lesson3ComparisonOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 3;

        boolean result1 = a < b ;
        System.out.println(result1);

        boolean result2 = a > b ;
        System.out.println(result2);

        boolean result3 = b > c ;
        System.out.println(result3);

        boolean result4 = b < c ;
        System.out.println(result4);

        boolean result5 = b == c ;
        System.out.println(result5);

        boolean result6 = b != c;
        System.out.println(result6);
    }
}
