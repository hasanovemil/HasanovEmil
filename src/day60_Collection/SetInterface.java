package day60_Collection;


import java.util.*;

public class SetInterface {

    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(8,5,4,3,2,10,7,1));
        s1.addAll(Arrays.asList(8,8,8,8,8,8,9));
        System.out.println("Hashset = " + s1);
        Set<Integer> s2 = new LinkedHashSet<>();
        s2.addAll(Arrays.asList(8,5,4,3,2,10,7,1));
        s2.addAll(Arrays.asList(8,8,8,8,8,8,9));
        System.out.println("Linked Hashset = " + s2);
        Set<Integer> s3 = new TreeSet<>();
        s3.addAll(Arrays.asList(8,5,4,3,2,10,7,1));
        System.out.println("Treeset = " + s3);


    }
}
