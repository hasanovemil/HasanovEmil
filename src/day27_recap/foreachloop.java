package day27_recap;

import java.util.Arrays;

public class foreachloop {

    public static void main(String[] args) {
        int[] nums = {3,5,1,4,2};
        Arrays.sort(nums);

        for(int i =0;i <= nums.length-1;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
       for(int each : nums){
           System.out.print(each+" ");
       }
        System.out.println();
       System.out.println("===========================================");
        for(int i =nums.length-1;i >= 0;i--){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        int[] scores = {10,20,30,40,50,60,70,80,90,100,110};
        int countdivisibleby3 = 0;
        for(int each :scores){
            if(each % 3 !=0){
                continue;
            }
            countdivisibleby3++;
            System.out.print(each+" ");

        }
        System.out.println();
        System.out.println(countdivisibleby3);
        System.out.println();
        System.out.println("==========================================");

        String[] names = {"AB","ABC","A","AB","ABCD"};
        for(String each:names){
            if(each.contains("C")){
                continue;
            }
            System.out.println(each);
        }
        System.out.println();
        System.out.println("==========================================");

        int[] score = {80,75,65,110,90,45,56,78};
        int max = score[0];
        int min = score[0];
        for(int each: score){
            if(each > max){
                max=each;
            }
            if(each < min){
                min = each;
            }
         }

        System.out.print("max: "+max);
        System.out.println("min: "+min);


    }
}
