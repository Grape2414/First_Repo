package module1.chapter1.operator;

public class Lesson6ShiftOperator {
    public static void main(String[] args) {

        int a=15 << 4; //15 * (2 ^ 4) = 15*16= 240
        System.out.println(a);

        int b=100>> 3; //100 / 2^3 = 100/8= 12
        System.out.println(b);

        int c=64>>>5; // 64/ 32= 2
        System.out.println(c);
    }
}
