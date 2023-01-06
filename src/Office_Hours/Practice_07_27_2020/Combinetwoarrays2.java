package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class Combinetwoarrays2 {

    public static void main(String[] args) {
        String[] arr1 = {"Emil","Rashad","Gunel"};
        String[] arr2 = {"Rasim","Aida","Rustam"};

        String[] arr3 = new String [arr1.length+arr2.length];

        int k = 0;
        for(int i =0;i <= arr1.length-1;i++){
            arr3[k]=arr1[i];
            k++;
        }

        for(int i =0;i <= arr2.length-1;i++){
            arr3[k]=arr2[i];
            k++;
        }

        System.out.println(Arrays.toString(arr3));



    }
}
