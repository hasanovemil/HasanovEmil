package day61_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String,Double> employees = new LinkedHashMap<>();
        employees.put("Emil",100000.0);
        employees.put("Rashad",200000.0);
        employees.put("Gunel",300000.0);


        System.out.println(employees);
        System.out.println(employees.size());







    }
}
