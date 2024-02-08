package module2.chapter4;

public class Lesson10 {
    static void claculate(int num1,int num2){
        int a=num1;
        int b=num2;
        int result=a+b;
        System.out.println(result);
    }

    static void fullname(String firstname, String lastname){
        System.out.println(firstname + lastname);
    }


    public static void main(String[] args) {
        claculate(23,7);

        fullname("Swan ","Htet");
    }
}
