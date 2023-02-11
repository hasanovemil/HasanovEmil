package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String,Double> employees = new LinkedHashMap<>();
        employees.put("Emil",100000.0);
        employees.put("Rashad",200000.0);
        employees.put("Ali",300000.0);
        employees.put("Aqil",400000.0);
        employees.put("Arif",500000.0);
        employees.put("Elsen",600000.0);
        employees.put("Namiq",700000.0);

        System.out.println(employees);
        System.out.println(employees.size());

        System.out.println("Salary of Rashad: "+employees.get("Rashad"));

        employees.remove("Gunel");
        System.out.println(employees);

        boolean r1 = employees.containsKey("Arif");
        System.out.println(r1);

        boolean r2 = employees.containsValue(300000.0);
        System.out.println(r2);









    }
}
