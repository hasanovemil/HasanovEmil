package day34_WrapperClasses;

import java.util.ArrayList;

public class List_Practice {

    public static void main(String[] args) {
        ArrayList<Integer>Oddlist = new ArrayList<>();
        ArrayList<Integer>Evenlist = new ArrayList<>();

        for(int i =0;i<=100;i++){
            if(i % 2==0){
                Evenlist.add(i);
            }else{
                Oddlist.add(i);
            }
        }

        System.out.println(Oddlist);
        System.out.println(Evenlist);
        System.out.println("============================");

        ArrayList<String>grocerylist = new ArrayList<>();
        grocerylist.add("Milk");
        grocerylist.add("Apple");
        grocerylist.add("Egg");
        grocerylist.add("Mango");
        grocerylist.add("Ice Cream");

        for(int i = grocerylist.size()-1; i >= 0;i--){
            System.out.print(grocerylist.get(i) +" ");
        }
        System.out.println();
        for(String each: grocerylist){
            System.out.print(each+" ");
        }

    }
}
