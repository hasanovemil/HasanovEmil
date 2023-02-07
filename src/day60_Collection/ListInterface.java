package day60_Collection;

import java.util.*;

public class ListInterface {


    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));
        list1.addAll(Arrays.asList(1,2,3,4,5));

        list1.add(6);

        System.out.println("ArrayList = " + list1);

        System.out.println(list1.get(2));

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5));
        list2.addAll(Arrays.asList(1,2,3,4,5));

        list2.add(6);


        System.out.println("LinkedList = " + list2);

        System.out.println(list2.get(2));

        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(1,2,3,4,5));
        list3.addAll(Arrays.asList(1,2,3,4,5));

        list3.add(6);


        System.out.println("Vector = " + list3);

        System.out.println(list3.get(2));



        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(1,2,3,4,5));
        list4.addAll(Arrays.asList(1,2,3,4,5));

        list4.add(6);


        System.out.println("Stack = " + list4);

        System.out.println(list4.get(2));

        ((Stack)list4).pop();

        System.out.println(list4);

        System.out.println("======================================================");

        Stack<Integer> list5 = new Stack<>();

        list5.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(list5);

        int lastObject = list5.pop();

        System.out.println(list5);

        System.out.println("=========================");

        int[] arr1 = {1,2,3,4,5};
        int[][] arr2 = {{1,2,3},{4,5,6,7,8,9}};

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("A");



        ArrayList<ArrayList<Integer>> l2 = new ArrayList<>();
        l2.add(new ArrayList<>(Arrays.asList(1,2,3,4)));
        l2.add(new ArrayList<>());

        l2.get(1).addAll(Arrays.asList(5,6,7,8,9));

        l2.get(0).removeAll(Arrays.asList(1,2));

        System.out.println(l2);

        System.out.println("Size of list1 = " + l2.get(0).size());

        System.out.println("Size of list2 = " + l2.get(1).size());


        List<List<String>> groups = new ArrayList<>();
        groups.addAll(Arrays.asList(new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()));

        groups.get(0).addAll(Arrays.asList("A","B"));
        groups.get(1).addAll(Arrays.asList("C","D"));
        groups.get(2).addAll(Arrays.asList("E","F"));
        groups.get(3).addAll(Arrays.asList("M","N"));
        groups.get(4).addAll(Arrays.asList("O","P"));
        groups.get(5).addAll(Arrays.asList("X","Y"));
        groups.get(6).addAll(Arrays.asList("T","Z"));

        for(List<String> eachgroup: groups){
            for(String eachstudent:eachgroup){
                System.out.println(eachstudent +"  ");
            }
        }





    }
}
