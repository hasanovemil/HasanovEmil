package day62_Maps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ListofMaps {
    public static void main(String[] args) {

        Map<String,String> scrum1 = new LinkedHashMap<>();
        scrum1.put("Emil","scientist");
        scrum1.put("Rashad","Agriculture enginner");
        scrum1.put("Gunel","Marketoloq");
        scrum1.put("Aida","Doctor");
        scrum1.put("Rasim","Enginner");

        Map<String,String> scrum2 = new LinkedHashMap<>();
        scrum2.put("Ali","scientist");
        scrum2.put("Aqil","Agriculture enginner");
        scrum2.put("Arif","Marketoloq");
        scrum2.put("Valid","Doctor");
        scrum2.put("Nesimi","Enginner");

        Map<String,String> scrum3 = new LinkedHashMap<>();
        scrum3.put("Imran","scientist");
        scrum3.put("Atilla","Agriculture enginner");
        scrum3.put("Cingiz","Marketoloq");
        scrum3.put("Teymur","Doctor");
        scrum3.put("Vasif","Enginner");

        List<Map<String,String>> list = Arrays.asList(scrum1,scrum2,scrum3);
        System.out.println(list);
        System.out.println(list.size());

        for(Map <String,String > each: list){
            System.out.println(each);
        }













    }
}
