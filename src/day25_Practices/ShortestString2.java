package day25_Practices;

public class ShortestString2 {

    public static void main(String[] args) {
        String[] arr = {"Anam","Nickolas","Amir","Nurmamet"};
        int minlength = arr[0].length();
        for(String each : arr){
            int l = each.length();
            if(l < minlength){
                minlength = l;
            }
        }

        for(String each : arr){
            if(each.length()==minlength){
                System.out.println(each);
            }
        }





    }
}
