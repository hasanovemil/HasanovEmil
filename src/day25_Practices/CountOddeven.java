package day25_Practices;

public class CountOddeven {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        int counteven =0;
        int countodd =0;
        for(int each : nums){
            if(each % 2==0){
                counteven++;
            }else{
               countodd++;
           }
        }

        System.out.println("Even numbers " + counteven);
        System.out.println("Odd numbers " + countodd);




    }
}
