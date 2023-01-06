package day30_CustomMethods;

import java.util.Arrays;

public class WarmupTasks {

    public static void main(String[] args) {

        maxNum(123,123);
        int[] arr = {9,5,6,10,1,12};
        printdesc(arr);
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {7,8,9,10,11,12};
        combine2Arrays(arr1,arr2);
        PosNegZero(100);
        System.out.println("=====================================");
        int[] a3 = {100,-100,-200,-300,0,0,900,5000};
        for(int each:a3){
            PosNegZero(each);
        }
    }

    // task01:
    public static void maxNum(int a,int b){
        if(a == b){
            System.out.println("Equal");
            return;
        }
       if(a>=b){
           System.out.println(a+"is maximum");
       }else{
           System.out.println(b+"is maximum");
       }
    }
    // task02:
    public static void printdesc(int[]arr){
        Arrays.sort(arr);
        for(int i = arr.length-1;i >=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // task03:
    public static void combine2Arrays(int[]arr1,int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        int i =0;
        for(int each:arr1){
            arr3[i]=each;
            i++;
        }
        for(int each : arr2){
            arr3[i]=each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));

    }
     // task04:
    public static void PosNegZero(int num){
        if( num > 0){
            System.out.println("Positive");
        }else if( num < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}
