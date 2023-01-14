package Office_Hours.Practice_09_09_2020;

public class Iphone extends Phone {


       public Iphone(String model,double price){
           super(model, price);
       }

       static{
           brand = "Iphone";
           madeIn = "China";
       }

       @Override
       public void call(long phonenumber){
           System.out.println("Iphone " +model+ " + is calling: ");
       }
       @Override
       public void text(long phonenumber){
           System.out.println("Iphone "+model+ " + is texting: "+phonenumber);
       }












}
