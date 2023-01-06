package day36_Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques2 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> uniques = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        for(int i =0;i <= list1.size()-1;i++){
            Integer element = list1.get(i);
            int count = Collections.frequency(list1,element);

            if(count ==1){
                uniques.add(element);
            }
        }
        System.out.println(uniques);





    }
}
