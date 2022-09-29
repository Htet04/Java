package basic;

import java.util.Arrays;

public class ArrayClasses {
    public static void main(String[] args) {
        /*
         one dimensional array
         two dimensional array
         */
        int[] fixed_size = new int[5];//this is fix size(length) array can't add more
        System.out.println(Arrays.toString(fixed_size));
        fixed_size[0] = 1;
        fixed_size[3] = 111;
        System.out.println(Arrays.toString(fixed_size));
    }
}
