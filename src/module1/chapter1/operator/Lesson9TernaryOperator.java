package module1.chapter1.operator;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Lesson9TernaryOperator {
    public static void main(String[] args) {
        int age=15;
        String result= (age > 10)? "Young":"Adult";
        System.out.println(result);

        int res=(false)? 23:55;
        System.out.println(res);

        int nu;
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        System.out.println("write a number");
        nu=sc.nextByte();
        String newe=(nu%2==0)? "even":"odd";
        System.out.println(newe);

       int n=7;
        String num=(n%2==0)? "even":"odd";
        System.out.println(num);
    }
}
