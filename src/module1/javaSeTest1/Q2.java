package module1.javaSeTest1;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        int i;
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        System.out.print("Enter a number : ");
        i=sc.nextInt();
        if (i<0){
            System.out.println("Negative");
        }
        else if (i==0) {
            System.out.println("Zero");
        }
        else {
            System.out.println("Positive");
        }
    }
}
