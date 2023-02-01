package day48_Inheritance.DeviceTask;

public class Laptop extends Device{

    public static boolean hasCPU;
    public static boolean hasMouse;
    public static boolean hasKeyBoard;
    public String OS;

    public Laptop(String brand, String model, double price, boolean hasbattery, boolean hasmemory, String screensize,String OS){
        setInfo(brand, model, price, hasbattery, hasmemory, screensize);
        this.OS = OS;
    }

    public void coding(String language){
        System.out.println("Coding: "+language+" in "+brand+" "+model);
    }

}
