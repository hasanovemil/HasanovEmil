package day35_Arraylist;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {
        ArrayList<String> earlyBirdlist = new ArrayList<>();
                earlyBirdlist.add("Emil");
                earlyBirdlist.add("Rashad");
                earlyBirdlist.add("Gunel");
                earlyBirdlist.add("Aida");
                earlyBirdlist.add("Rustam");

                earlyBirdlist.set(2,"Rasim");
                earlyBirdlist.set(0,"Lan");

        System.out.println(earlyBirdlist);
        System.out.println("=============================================");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(2);
        list.remove(3);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        Integer a = 1;
        list2.remove(a);

        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Emil");
        list3.add("Rashad");
        list3.add("Gunel");
        list3.add("Aida");
        list3.add("Rustam");

       // list3.remove(2);
        boolean r = list3.remove("gunel");
        // list3.remove("Gunel");
        System.out.println(r);


    }
}
