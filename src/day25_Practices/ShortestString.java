package day25_Practices;

public class ShortestString {

    public static void main(String[] args) {
        String[] arr = {"Anam","Nickolas","Amir","Nurmamet","Ali"};
        int minlength = arr[0].length();
        for(int i =0;i <= arr.length-1;i++){
            int l = arr[i].length();
            if(l < minlength){
                minlength = l;
            }
        }

        for(int i =0;i <= arr.length-1;i++){
            if(arr[i].length()==minlength){
                System.out.println(arr[i]);
            }
        }






    }
}
