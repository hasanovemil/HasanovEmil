package day48_Inheritance.DeviceTask;

public class Device {

    public String brand;
    public String model;
    public double price;
    public boolean hasbattery;
    public boolean hasmemory;
    public String screensize;

    public static String madein;
    public static boolean isElectronic;

    static {
        madein = "China";
        isElectronic = true;
    }

    public void setInfo(String brand, String model, double price, boolean hasbattery, boolean hasmemory, String screensize) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.hasbattery = hasbattery;
        this.hasmemory = hasmemory;
        this.screensize = screensize;
    }

     public String toString(){
        return "=============================================="+
                "\nBrand: "+brand+
                "\nModel: "+model+
                "\nMadein : "+madein+
                "\nScreensize: "+screensize+
                "\nPrice: "+price+
                "\nDoes it have battery: "+hasbattery+
                "\nDoes it have memory: "+hasmemory+
                "========================================";
    }


   }






