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
    protected void call(long phonenumber){
        System.out.println("Phone is calling: " + phonenumber);
    }
    protected void text(long phonenumber) {
        System.out.println("Phone is texting to: " + phonenumber);
    }

    public String toString() {
        return "Brand: "+brand+"\nModel: "+model+"\nPrice; "+price+"\nMadein: "+madeIn;
    }
}
