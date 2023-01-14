package Office_Hours.Practice_09_09_2020;

public class Phone {

    public String model;
    public int price;
    public String madein;

    public static String brand;

    public Phone(String model, int price, String madein) {
        this.model = model;
        this.price = price;
        this.madein = madein;
    }
    static{
        brand = "MadeinChina";
    }

    public void call(){
        System.out.println("");
    }











}
