package module1.chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class UserinputArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();

        int [] userInputArray = new int[size];

        for (int i = 0; i < userInputArray.length; i++) {
            System.out.print("Enter the value : ");
            int number = scan.nextInt();
            userInputArray[i] = number;
        }

        System.out.print(Arrays.toString(userInputArray));
    }
}
