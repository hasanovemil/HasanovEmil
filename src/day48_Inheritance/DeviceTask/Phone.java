package day48_Inheritance.DeviceTask;

public class Phone extends Device {

    public static boolean hasSimCard = true;
    public String OS;

    public Phone(String brand, String model, double price, boolean hasbattery, boolean hasmemory, String screensize,String OS){
         setInfo(brand,model,price,hasbattery,hasmemory,screensize);
         this.OS = OS;
    }

    public void call(long phonenumber){
        System.out.println("Calling: "+phonenumber);
    }
    public void text(long phonenumber){
        System.out.println("texting to "+phonenumber);
    }






}
