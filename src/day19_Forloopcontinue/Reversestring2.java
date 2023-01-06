package day19_Forloopcontinue;

public class Reversestring2 {

    public static void main(String[] args) {
        String str = "Emil HAsanov Javani oyrene bilecek";

        // String result = ""+str.charAt(str.length()-1)+str.charAt(2)+str.charAt(1)+str.charAt(0);
         String result = "";
         for(int i = str.length()-1; i >= 0; i--){
             result += str.charAt(i);

         }
         System.out.println(result);









    }
}
