package day33_LocalDateTime;

import java.util.Arrays;

public class Calculate {
    public static void main(String[] args) {
        double a =10;
        double b = 20;
        System.out.println(addition(a,b));
        int[] arr1 ={4,3,2,1};
        Arrays.sort(arr1);
        char[] arr2 = {'C','B','A'};
        Arrays.sort(arr2);
    }

    public static int addition(int a,int b){

        return a+b;
    }
    public static double addition(double a,double b){
        return a+b;
    }

    public static double addition(double a,int b){
        return a+b;
    }

    public static int multiplication(int a,int b){
        return a*b;
    }

    public static double mutliplication(double a,double b){
        return a*b;
    }


}
