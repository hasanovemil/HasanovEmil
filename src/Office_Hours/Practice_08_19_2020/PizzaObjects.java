package Office_Hours.Practice_08_19_2020;

import java.util.ArrayList;

public class PizzaObjects {
    public static void main(String[] args) {
        ArrayList<Pizza> pizzaforBatch20 = new ArrayList<>();

        for(int i = 0;i < 400; i++){
            Pizza myPizza = new Pizza();
            myPizza.setPizzaInfo("large",5,3);
            pizzaforBatch20.add(myPizza);
        }

        System.out.println("Total number of pizza: " + pizzaforBatch20.size());

        double totalPrice = 0;

        for( Pizza each : pizzaforBatch20){
            totalPrice += each.calcPrice();
        }

        System.out.println("Total price: " + totalPrice);

        System.out.println("=======================================================");

        Pizza pizza1 = new Pizza();
        pizza1.setPizzaInfo("Large",5,6);


        Pizza pizza2 = new Pizza();
        pizza2.setPizzaInfo("Medium",7,8);

        System.out.println("Rashad' pizza: " + pizza1.calcPrice());

        System.out.println();

        System.out.println("Gunel' pizza: " + pizza2.calcPrice());



    }
}
