package Office_Hours.Practice_08_12_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Quiz {
    public static void main(String[] args) {


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3));
        int a = 1;
        list1.remove(a);
        System.out.println(list1);

        String[] names = {"Emil","Rashad","Gunel","Rashad"};

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(names));

        if(list.remove("Rashad")){
            list.remove("Rasim");
        }
        System.out.println(list);
        System.out.println("============================================");

        ArrayList<String> color = new ArrayList<>();
        color.add("green");
        color.add("red");
        color.add("blue");
        color.add("yellow");
        color.add(3,"cyan");

        System.out.println(color);

        System.out.println("========================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5));

       /* list2.set(0,list2.get(4));
        list2.set(4,list2.get(0));

        */
        Collections.swap(list2,0,list2.size()-1);

        System.out.println(list2);
        System.out.println("=============================================");

        ArrayList<Character> chars = new ArrayList<>();
        for( char i ='a';i <= 'z';i++){
            chars.add(i);
            System.out.print(i+" ");
        }

        System.out.println();
        boolean r1 = chars.containsAll(Arrays.asList('a','b','D'));

        System.out.print(r1);

    }




}
