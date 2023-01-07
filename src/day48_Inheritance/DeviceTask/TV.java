package day48_Inheritance.DeviceTask;

public class TV extends Device {

    public boolean hasremotecontrol;

    public TV(String brand, String model, double price, boolean hasbattery, boolean hasmemory, String screensize,boolean hasremotecontrol){
           setInfo(brand,model,price,hasbattery,hasmemory,screensize);
           this.hasremotecontrol = hasremotecontrol;
    }

    public void watch(){
        System.out.println("Watching "+brand+" "+model);
    }



}
