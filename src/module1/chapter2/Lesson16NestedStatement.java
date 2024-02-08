package module1.chapter2;

public class Lesson16NestedStatement {
    public static void main(String[] args) {
        int a=23 , b=25 , c= 45;

        if (a>b){
        if (a>c){
            System.out.println(a + " is the largest");
        }
        else {
            System.out.println(c + " is the largest");
         }
        }
        else {
            if (b>a){
                System.out.println(b+ " is the largest");
            }
            else {
                System.out.println(c + " is the largest");
            }
        }
    }
}
