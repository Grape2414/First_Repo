package module1.chapter3;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.print("Enter your username : ");
        String username =name.next();
        System.out.println("Your username is : " + username);
        name = new Scanner(System.in);

        System.out.print("Enter Your name : ");
        String input = name.nextLine();
        System.out.println("Your name is : " + input);

        System.out.print("Enter your age :");
        int age =name.nextInt();
        System.out.println("Your age is : " + age);

    }
}
