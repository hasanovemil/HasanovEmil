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


        List<List<String>> groups = new Stack<>();
        groups.addAll(Arrays.asList(new Stack<>(),
                new Stack<>(),
                new Stack<>(),
                new Stack<>(),
                new Stack<>(),
                new Stack<>(),
                new Stack<>()));

        groups.get(0).addAll(Arrays.asList("Emil","Rashad","Gunel","Aida"));
        groups.get(1).addAll(Arrays.asList("Rustam","ALi","Elsen","Aqil"));
        groups.get(2).addAll(Arrays.asList("Ramil","Isa","Aqsin","Murad"));
        groups.get(3).addAll(Arrays.asList("Arif","Valid","Orxan","Vaqif"));
        groups.get(4).addAll(Arrays.asList("Babek","Cingiz","Xalid","Ulker"));
        groups.get(5).addAll(Arrays.asList("Vuqar","Tabriz","Nabi","Zakir"));
        groups.get(6).addAll(Arrays.asList("Sakir","Mehman","Tural","Vasif"));

        for(List<String> eachgroup : groups){
            System.out.println(((Stack)eachgroup).pop());
            System.out.println(eachgroup);
        }





    }
}
