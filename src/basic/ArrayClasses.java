package basic;

import java.util.Arrays;

public class ArrayClasses {
    public static void main(String[] args) {
        /*
         one dimensional array
         two dimensional array
         */
        //one dimensional array
        int[] fixed_size = new int[5];//this is fix size(length) array can't add more
        System.out.println(Arrays.toString(fixed_size));
        fixed_size[0] = 1;
        fixed_size[3] = 111;
        System.out.println(Arrays.toString(fixed_size));

        //two dimensional array
        int[][] two_di = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(two_di[2][2]);
        System.out.println(Arrays.deepToString(two_di));
        for (int i1 = 0; i1 < two_di.length; i1++) {
            for (int i2 = 0; i2 < two_di[i1].length; i2++) {
                System.out.println(two_di[i1][i2]);
            }
        }
    }
}
