package module1.chapter2;

public class Lesson17NestedForLoop {
    public static void main(String[] args) {

        for (int a=0; a<5; a++){ //row
            for (int b=1; b<=a; b++){  //coloum
                System.out.print( "*\t");
            }
            System.out.println();
        }
    }
}
