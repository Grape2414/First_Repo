package module1.chapter1.operator;

public class Lesson4LogicalOperator {
    public static void main(String[] args) {

        boolean con1 = 23 == 23;
        boolean con2 = 23 != 23;
        boolean result1 = con1 && con2;
        System.out.println(result1);

        int a = 3;
        int b = 2;
        boolean result2 = a == b;
        System.out.println(result2 );

        int d = 8;
        int c = 3;
        boolean result3 = d != c;
        System.out.println(result3);
        boolean stage1 = result3 || result2;
        System.out.println(stage1);
    }
}
