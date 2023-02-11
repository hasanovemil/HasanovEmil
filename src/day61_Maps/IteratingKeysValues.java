package day61_Maps;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IteratingKeysValues {
    public static void main(String[] args) {

        Map<String, LocalDate> students = new TreeMap<>();

        students.put("Hasan", LocalDate.of(1985,4,4));
        students.put("Ali",LocalDate.of(1979,1,5));
        students.put("Arif",LocalDate.of(1976,5,16));

        System.out.println(students);

        for(String each : students.keySet()){
            System.out.println(each);
        }

        for(LocalDate each: students.values()){
            System.out.println(each);
        }








    }
}
