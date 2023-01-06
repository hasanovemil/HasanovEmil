package day36_Arraylist;

import java.util.ArrayList;

public class Set_Method {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.set(4,0);

        System.out.println(list);
        System.out.println("==================================");

        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i = 1;i <= 20;i++){
            list2.add(i);
        }
        System.out.println(list2);
        for(int i = 0; i <= list2.size()-1;i++){
             Integer each = list2.get(i);
             if(each % 2 !=0){
                 list2.set(i,each*2);
             }else{
                 list2.set(i,each*3);
             }
        }
        System.out.println(list2);
    }
}
