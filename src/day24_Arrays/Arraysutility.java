package day24_Arrays;
import java.util.Arrays;
public class Arraysutility {

    public static void main(String[] args) {
      int [] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));

        String[] names = {"Emil","Rashad","Gunel","Aida","Rustam"};
        System.out.println(Arrays.toString(names));
        System.out.println("=================================================");
        int[] nums = {4,10,9,1,2,3,8};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Maximum number:" + nums[nums.length-1]);
        System.out.println("Minimum number:"+nums[0]);
        System.out.println("================================================");
        int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3};
        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);




    }
}
