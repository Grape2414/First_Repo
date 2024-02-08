package module1.chapter2;

public class NestedForLoopExercise2 {
    public static void main(String[] args) {

for (int a=4; a>=0; a--)
{

    for (int b=1; b<=a; b++)
    {
        System.out.print(" \t");
    }

    for (int c=4; c>=a; c--)
    {
        System.out.print(" *\t");
    }
    System.out.println();

}

   }
}

