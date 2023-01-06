package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist_Methods {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","Mercedes","Infiniti","Tesla","WV","Lamborghini","Lexus","Tesla","Tesla","Mazda"));

        // cars.remove("Tesla");
       // cars.removeAll(Arrays.asList("Tesla"));
        // cars.removeIf(p -> p.toLowerCase().contains("m"));
      //  System.out.println(cars);

        //cars.retainAll(Arrays.asList("Tesla"));
         System.out.println(cars);

        System.out.println("=====================================");

        ArrayList<String> grocerylist = new ArrayList<>();
        grocerylist.addAll(Arrays.asList("egg","milk","bread","butter"));
        // boolean each =  grocerylist.contains("Pepsi");
        //System.out.println(each);

       boolean r1 =  grocerylist.containsAll(Arrays.asList("milk","egg"));
        System.out.println(r1);
        System.out.println(grocerylist.size());

        grocerylist.set(grocerylist.size()-1,"Apple");
        System.out.println(grocerylist);



    }
}
