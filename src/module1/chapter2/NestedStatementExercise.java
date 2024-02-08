package module1.chapter2;

public class NestedStatementExercise
{
    public static void main(String[] args)
    {
        int a=91, b=51, c=31;

        if (a<b)
        {
           if (a<c)
           {
                System.out.println( a + " is the smallest");
           }
           else
           {
                System.out.println(c + " is the smallest");
           }
        }
        
        else
        {
            if (b<c)
            {
                System.out.println(b + " is the smallest");
            }
            else
            {
                System.out.println(c + " is the smallest");
            }
        }
    }
}
