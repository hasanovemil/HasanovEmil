package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class Combinetwoarrays {

    public static void main(String[] args) {
        char[] arr1 = {'A','B','C'};
        char[] arr2 = {'D','E','F'};

        char[] arr3 = new char [arr1.length+arr2.length];

        int k = 0;
        for(char each : arr1){
            arr3[k]=each;
            k++;
        }

        for(char each : arr2){
            arr3[k]=each;
            k++;
        }

        System.out.println(Arrays.toString(arr3));



    }
}
