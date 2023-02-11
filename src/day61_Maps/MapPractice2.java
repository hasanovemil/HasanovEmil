package day61_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;


public class MapPractice2 {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> students = new LinkedHashMap<>();
        students.put("Emil",89);
        students.put("Rashad",95);
        students.put("Gunel",85);
        students.put("Ali",98);
        students.put("Vuqar",92);
        students.put("Aqil",95);
        students.put("Teymur",95);
        students.put("Seymur",93);
        students.put("Xeyale",100);
        students.put("Vasif",71);
        students.put("Valid",50);
        students.put("Nesimi",60);


      //  LinkedHashMap<String,Integer> earlyBirds = new LinkedHashMap<>();
       // LinkedHashMap<String,Integer> angryBirds = new LinkedHashMap<>();

        List<String> earlyBirdsList = new ArrayList<>();


        for(String eachKey :students.keySet()) {
            Integer eachvalue = students.get(eachKey);

            /* if(eachvalue >= 95){
                earlyBirds.put(eachKey,eachvalue);
            }else{
                angryBirds.put(eachKey,eachvalue);
            }
        }
        */
            if (eachvalue > 90) {
                earlyBirdsList.add(eachKey);
            }
        }
        System.out.println(earlyBirdsList);









    }
}
