package day32_MethodOverloading;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        int num = 4;
        int[] arr2 = new int[arr.length+1];
        arr2[arr2.length-1]=num;
        int i =0;
        for(int each : arr){
            arr2[i]=each;
            i++;
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("====================================");
        int[] scores={85,95,115,120,50,60};
        int n1 = 150;
        scores = AddElement(scores,n1);

        System.out.println(Arrays.toString(scores));

    }
    public static int[] AddElement(int[] arr,int num){
        int[] arr2 = new int[arr.length+1];
        arr2[arr2.length-1]=num;
        int i =0;
        for(int each : arr){
            arr2[i]=each;
            i++;
        }
        return arr2;
    }


}
