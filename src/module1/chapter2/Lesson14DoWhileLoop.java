package module1.chapter2;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Lesson14DoWhileLoop {
    public static void main(String[] args) {
   int loop=5;
    do {
        System.out.println(loop);
        loop++;
        break;
    }while (loop<= 10);

    }
}
