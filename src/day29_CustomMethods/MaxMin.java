package day29_CustomMethods;

public class MaxMin {
    public static void main(String[] args) {
     int[] numbers = {1,2,3,4,5,6};
        Maxnum(numbers);
        Minnum(numbers);

    }


    public static void Maxnum(int[] arr){
        int max = arr[0];
        for(int each:arr){
            if(each > max){
                max = each;
            }
        }
        System.out.println("maximum number" + max);
    }
    public static void Minnum(int[] arr){
        int min = arr[0];
        for(int each:arr){
            if(each < min){
                min = each;
            }
        }
        System.out.println("minimum number" + min);

    }
}
