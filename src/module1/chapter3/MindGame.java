package module1.chapter3;

import java.util.Random;

public class MindGame {
    public static void main(String[] args) {

        Random number = new Random();
        int rnum= number.nextInt(1,7);
        System.out.println(rnum);
    }
}
