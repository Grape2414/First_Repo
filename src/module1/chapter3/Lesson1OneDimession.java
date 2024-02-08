package module1.chapter3;

import java.util.Arrays;

public class Lesson1OneDimession {
    public static void main(String[] args) {
        // datatype variableName = value
        String name= "Swan Swan";

        //datatype arrayName = {variable}
        String []names = {"Swan, Htet , Naing"};
        int []numbers = {19,31,34,656,7,8,9,7,5,3,1,};

        System.out.println(name);

        System.out.println(names[2]);
        System.out.println(names[3]);

        System.out.println(names);
        //Arrays.toString
        System.out.println(Arrays.toString(names));
        System.out.println(numbers.length);
        System.out.println(numbers[numbers.length-3]);

        System.out.println(name);
        name = " Swan Htet Naing";

        System.out.println(names[0]);
        names[0] = "Hello";
        System.out.println(Arrays.toString(names));

        //dt an new dt as
        int numbers2[] = new int[6];
        System.out.println(Arrays.toString(numbers2));

        String names2[]= new String[8];
        System.out.println(Arrays.toString(names2));

        names2[0] = "Swan";
        System.out.println(Arrays.toString(names2));
     }
}
