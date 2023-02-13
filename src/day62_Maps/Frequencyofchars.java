package day62_Maps;

import java.util.*;

public class Frequencyofchars {

    public static void main(String[] args) {

        String str = "aaabbbccb";   //a2b4c2

        Map<String,Integer> map = new LinkedHashMap<>();  // { a = 3, b = 4, c = 2 }

        List<String> list = Arrays.asList(str.split(""));
        System.out.println(list);

        for(String each : list){  // a, a, a, b, b, b, c, c, b
             int frequency = Collections.frequency(list,each);
             map.put(each,frequency);
        }
        System.out.println(map);










    }
}
