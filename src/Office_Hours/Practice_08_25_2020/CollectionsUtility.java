package Office_Hours.Practice_08_25_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));

        Collections.swap(list1,0,1);

        System.out.println(list1);

        Integer max = Collections.max(list1);
        Integer min = Collections.min(list1);

        System.out.println(max);
        System.out.println(min);

        System.out.println("===================================================");

        String[] arr = {"Eggs","Orange","Milk","Milk","Toilet Paper","Toilet Paper","Toilet Paper","Toilet Paper","Avocado"};

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList(arr));
        System.out.println(items);

        int count = Collections.frequency(items,"Toilet Paper");
        System.out.println(count);

        items.removeIf(p -> Collections.frequency(items,p) != 1);

        System.out.println(items);






    }
}
