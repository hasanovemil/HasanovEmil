package day62_Maps;

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "abacbdeef";

        Map<String,Integer> map1 = new LinkedHashMap<>();

        List<String> list = Arrays.asList(str.split(""));

        for(String each : list){
            if(Collections.frequency(list,each)==1){
                map1.put(each,1);
            }
        }
        System.out.println(map1);





    }
}
