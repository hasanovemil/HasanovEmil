package day61_Map;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,3,4,5,6,7,7,7,8,9,9));

        System.out.println(list);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        System.out.println(set);








    }
}
