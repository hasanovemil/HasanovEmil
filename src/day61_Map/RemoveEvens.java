package day61_Map;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveEvens {
    public static void main(String[] args) {

        Integer[] arr1 = {1,2,3,4,5,6,7,9,10,11,12,13,14,15,16};

        Set<Integer> list = new LinkedHashSet<>();
        list.addAll(Arrays.asList(arr1));

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            if(it.next()%2 ==0){
                it.remove();
            }
        }
        System.out.println(list);







    }



}
