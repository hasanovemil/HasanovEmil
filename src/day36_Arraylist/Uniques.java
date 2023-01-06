package day36_Arraylist;

import java.util.ArrayList;

public class Uniques {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> uniques = new ArrayList<>();
         list1.add(1);
         list1.add(1);
         list1.add(2);
         list1.add(3);
         list1.add(3);
         list1.add(4);
         list1.add(5);

         for(int i =0;i <= list1.size()-1;i++){
             Integer element = list1.get(i);
             int count = 0;
             for(Integer each : list1){
                 if(each==element){
                     count++;
                 }
             }
             if(count ==1){
                 uniques.add(element);
             }
         }
        System.out.println(uniques);





    }
}
