package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;

public class Array_Desc2 {

    public static void main(String[] args) {
        int[] arr = {98,97,100,200,55,68};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int[] descArr1 = new int[arr.length];

        int k = arr.length-1;
        for(int each : arr){
            descArr1[k] = each;
            k--;
        }
        System.out.println(Arrays.toString(descArr1));

    }
}
