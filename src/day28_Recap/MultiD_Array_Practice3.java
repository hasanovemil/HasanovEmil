package day28_Recap;

import java.util.Arrays;

public class MultiD_Array_Practice3 {

    public static void main(String[] args) {
      int[][] arr2D = {{1,2,3},{4,5,6}};

      int[][][] arr3d = {{ {1,2,3},{4,5,6}},{{7,8,9},{10,11,12}} };
        System.out.println(Arrays.deepToString(arr3d[1]));

        System.out.println(Arrays.toString(arr3d[1][1]));

        System.out.println(arr3d[1][1][1]);
        System.out.println();
        System.out.println("=================================================");






    }
}
