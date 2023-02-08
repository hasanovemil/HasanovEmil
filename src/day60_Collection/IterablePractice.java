package day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterablePractice {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

      /*  for(int i = 0; i < list1.size();i++){
            if(list1.get(i) < 5){
                list1.remove(i);
            }
        }

       */
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        list2.removeIf(p -> p < 5);

        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Iterator<Integer> it = list3.iterator();

        while (it.hasNext()){
            if(it.next() < 5){
                it.remove();
            }
        }
        System.out.println(list3);










    }



}
