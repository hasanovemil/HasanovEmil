package day37_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Emil");
        students.add("Rashad");
        students.add("Gunel");
        students.add("Aida");
        students.add("Rustam");
        students.add("Rasim");

        boolean r1 = students.containsAll(Arrays.asList("Xalid"));
        System.out.println(r1);
        System.out.println("===========================================");
        ArrayList<String> group1 = new ArrayList<>();

        group1.addAll(Arrays.asList("Emil","Rashad","Gunel"));
        System.out.println(group1);
        boolean r4 = group1.containsAll(Arrays.asList("Aida","Rustam"));
        System.out.println(r4);

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Emil","Emil","Rashad","Rashad","Gunel","Aida"));
        System.out.println(names);
        names.removeAll(Arrays.asList("Emil","Rashad"));
        System.out.println(names);


    }
}
