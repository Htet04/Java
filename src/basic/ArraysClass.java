package basic;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args){
        // Arrays
        // One Dimensional Arrays
        // Limit Arrays length
        // Can't add more values
        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));

        // Un-Limited Arrays length
        // can add more values
        int[] arr1 = {2,9,2,3,3};
        System.out.println(Arrays.toString(arr1));

        // Two Dimensional Arrays
        int[][] matrix = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println(matrix[0][2]);
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.deepToString(matrix));
    }
}
