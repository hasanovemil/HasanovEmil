package day61_Maps;

import java.util.LinkedHashMap;


public class MapPractice2 {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> students = new LinkedHashMap<>();
        students.put("Emil",89);
        students.put("Rashad",95);
        students.put("Gunel",85);
        students.put("Ali",98);
        students.put("Arif",75);

        for(String eachKey :students.keySet()){
            Integer eachvalue = students.get(eachKey);
            if(eachvalue < 80){
                System.out.println(eachKey);
            }
        }










    }
}
