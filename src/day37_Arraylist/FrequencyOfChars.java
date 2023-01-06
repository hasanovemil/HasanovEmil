package day37_Arraylist;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "AAABBC";

        ArrayList<String> list = new ArrayList<>();
        for( String each : str.split("")){
            list.add(each);
        }

        String nonDup = Util.removedup(str);

        for(String each : nonDup.split("")){
            int count = Collections.frequency(list,each);
            System.out.print(each+count+" ");
        }


    }
}
