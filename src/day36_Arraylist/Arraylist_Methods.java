package day36_Arraylist;

import java.util.ArrayList;

public class Arraylist_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(40);

        System.out.println(list.indexOf(40));
        System.out.println(list.lastIndexOf(40));

        boolean r1 = list.contains(100);
        System.out.println(r1);

        System.out.println("=============================================");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hasanov");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hasanov");

        System.out.println(list1.equals(list2));

    }
}
