package module1.chapter2;

public class NestedForLoopExercise1 {
    public static void main(String[] args) {

        for (int a=5; a>0; a--){
            for (int b=1; b<=a; b++){
                System.out.print( "*\t");
            }
            System.out.println();
        }
    }
}
