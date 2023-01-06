package Office_Hours.Practice_07_20_2020;

import java.util.Arrays;

public class Max_2DArray_2 {
    public static void main(String[] args) {

        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        int max = arr2D[0][0];

        for(int[] each1d:arr2D){
            for(int eachnumber:each1d){
                if(eachnumber>max){
                    max = eachnumber;
                }
            }
        }
        System.out.println(max);


    }


}
