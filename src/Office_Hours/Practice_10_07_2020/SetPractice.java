package Office_Hours.Practice_10_07_2020;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {

        String[] names = {null,"Emil","Rashad","Gunel","Ali","Arif","Arif","Arif","Arif"};

        Integer[] arr1 = {4,5,6,9,100,50,620,49,54,63};

        Set<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(names));

        System.out.println("hashSet = " + hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(names));

        System.out.println("linkedHashSet = " + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
       treeSet.addAll(Arrays.asList(arr1));

        System.out.println("treeSet = " + treeSet);


    }
}
