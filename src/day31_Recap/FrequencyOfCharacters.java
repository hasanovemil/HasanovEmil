package day31_Recap;
import Library.Util;
public class FrequencyOfCharacters {

    public static void main(String[] args) {
         String str = "AABBBCCC";

         String exceptedresult = "";
         String nonDup = Util.removedup(str);

         for( char each : nonDup.toCharArray()){
             int count1 = Util.frequency(str,each);
             exceptedresult += ""+each+count1;
         }

        /* for(int i =0;i <= nonDup.length()-1;i++){
            char ch1 = nonDup.charAt(i);
            int count1 = Util.frequency(str,ch1);
            exceptedresult += ""+ch1+count1;
        }
        */


        /*

         char ch1 = nonDup.charAt(0);
         int count1 = Util.frequency(str,ch1);
         exceptedresult += ""+ch1+count1;

         char ch2 = nonDup.charAt(1);
         int count2 = Util.frequency(str,ch2);
         exceptedresult += ""+ch2+count2;

        char ch3 = nonDup.charAt(2);
        int count3 = Util.frequency(str,ch3);
        exceptedresult += ""+ch3+count3;

         */

        System.out.println(exceptedresult);
        System.out.println("=====================================");



    }

    public static String frequencyofChars(){
        String str = "AABBBCCC";
        String exceptedresult = "";
        String nonDup = Util.removedup(str);

        for( char each : nonDup.toCharArray()){
            int count1 = Util.frequency(str,each);
            exceptedresult += ""+each+count1;
        }
        return exceptedresult;
    }
}
