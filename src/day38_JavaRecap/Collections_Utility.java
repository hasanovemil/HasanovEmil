package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('R','S','O','P','D','A','B'));
        System.out.println(chars);
        Collections.sort(chars);
        System.out.println(chars);

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Emil","Rasim","Rashad","Gunel","Aida","Rustam"));

        Collections.swap(students,students.indexOf("Rasim"),students.size()-1);
        System.out.println(students);

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Cofee","Cofee","Egg","Battery","Battery","Battery","Battery"));

        int count = Collections.frequency(items,"Battery");
        System.out.println(count);

        ArrayList<String> uniques = new ArrayList<>();

        for(String each : items){
            int i = Collections.frequency(items,each);
            if(i == 1){
               uniques.add(each);
            }
        }
        System.out.println(uniques);

        ArrayList<String> uniques2 = new ArrayList<>();
        uniques2.addAll(items);
        uniques2.removeIf( p -> Collections.frequency(uniques2,p)!=1);
        System.out.println(uniques2);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Integer b = Collections.max(nums);
        Integer c = Collections.min(nums);

        System.out.println(b);
        System.out.println(c);

        



    }
}
