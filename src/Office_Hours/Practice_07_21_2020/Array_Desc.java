package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;

public class Array_Desc {

    public static void main(String[] args) {
        int[] arr1 = {98,97,100,200,55,68,79};

        Arrays.sort(arr1);

        int[] descArr = new int[arr1.length];

        System.out.println(Arrays.toString(arr1));

        int k = 0;
        for(int i = arr1.length-1;i >=0;i--){
            descArr[k]=arr1[i];
            k++;
        }
        System.out.println(Arrays.toString(descArr));


    }
}
