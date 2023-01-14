package Office_Hours.Practice_09_09_2020;

public class Phone {


    public static String brand;
    public static String madeIn;

    public String model;
    public double price;

    public Phone(String model,double price){
        this.model = model;
        this.price = price;
    }
    public void call(long phonenumber){
        System.out.println("Phone is calling: " + phonenumber);
    }
    public void text(long phonenumber) {
        System.out.println("Phone is texting to: " + phonenumber);
    }

    @Override
    public String toString() {
        return "Brand: "+brand+"\nModel: "+model+"\nPrice; "+price+"\nMadein: "+madeIn;
    }
}
