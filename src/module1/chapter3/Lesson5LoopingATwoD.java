package module1.chapter3;

import java.util.Arrays;

public class Lesson5LoopingATwoD {
    public static void main(String[] args) {
        String []names = {"swan , htet , naing"};
        int []numbers = {19,31,34,656,7,8,9,7,5,3,1,};

//        //whileLoop
//        int x= 0;
//        while (x<names.length){
//            names[x] = names[x].toUpperCase();
//            x++;
//        }
//        System.out.println(Arrays.toString(names));
//
//        //fori
//        //customise writing
//        for (int i = 0; i < names.length; i++) {
//            names[i] = names[i].toUpperCase();
//
//        }
//       System.out.println( Arrays.toString(names));


        //for i
        for (int i = names.length - 1; i >= 0; i--) {
            names[i] = names[i].toLowerCase();
            System.out.print(names[i] + " | ");
        }
    }
}
