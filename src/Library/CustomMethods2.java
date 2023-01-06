package Library;

public class CustomMethods2 {
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
