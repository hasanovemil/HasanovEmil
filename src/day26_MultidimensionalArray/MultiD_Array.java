package day26_MultidimensionalArray;

import java.util.Arrays;

public class MultiD_Array {

    public static void main(String[] args) {
        char[] ch1 = {'A','B'};
        char[] ch2 = {'C','D','E'};
        char[] ch3 = {'F','G','H'};

        char[][] ch2D = { {'A','B'},{'C','D','E'},{'F','G','H'}};

        System.out.println(Arrays.toString(ch2D[1]));
        System.out.println(Arrays.toString(ch2D[2]));

        System.out.println( ch2D[2][2]);

        System.out.println("=======================================================");

        int[][] nums = { {1,2,3},{4},{5,6},{7,8,9,10}};

        for( int i =0;i <=nums.length-1;i++){
            System.out.println(Arrays.toString(nums[i]));
        }
        System.out.println(Arrays.deepToString(nums));





    }
}
