package day34_WrapperClasses;

import java.util.Arrays;

public class WrapperClass_Practice {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        Integer[] arr2 = {1,2,3,4};
        for(Integer each : arr2){
            System.out.println(each);

            String[] nums1 = {"12.5", "13.5", "14.5", "15.5"};

            double[] nums2 = new double[nums1.length];

            for(int i =0;i <= nums1.length-1;i++){
                nums2[i] = Double.parseDouble(nums1[i]);
                System.out.println(Arrays.toString(nums2));
            }



        }
    }
}
