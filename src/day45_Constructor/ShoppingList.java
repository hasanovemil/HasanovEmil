package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

        Item item1 = new Item("Apple",15,3);
        Item item2 = new Item("Bread 1Lb",0.97,5);
        Item item3 = new Item("Manchego Cheese 1.75Lb",9.89,2);
        Item item4 = new Item("Garbanzo Beans 15.05oz",0.88,5);
        Item item5 = new Item("Almond Milk 1/2 Gallon",1.79,2);

        ArrayList<Item> list = new ArrayList<>();
        list.addAll(Arrays.asList(item1,item2,item3,item4,item5));

        System.out.println("Items: "+list.size());
        double totalCost = 0;
 
        for(Item each : list){
            totalCost +=each.calcCost();
        }

        System.out.println("Total price: "+totalCost);

        System.out.println("=====================================================");

        Item[] items = {item1,item2,item3,item4,item5};
        double totalcost2 = 0;
        for(int i =0;i<= items.length-1;i++){
           totalcost2 +=items[i].calcCost();
        }
        System.out.println("Totalcost: "+totalcost2);






    }
}
