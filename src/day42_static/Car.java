package day42_static;

public class Car {
    String brand;
    String model;
    int year;
    int VIN;
    String color;
    double price;

    static boolean hasWheel=true;
    static int numberofTires = 4;
    static boolean hasEngine=true;
    static boolean hasDoors=true;
    static boolean hasAirbag = true;
    static boolean hasSeatBelt= true;
    static boolean hasHorn = true;

    public void start(){
        System.out.println("Starting "+brand+" "+model);
    }
    public static void printTires(){
        System.out.println(numberofTires+" Tires");
    }
    public String toString(){
        return "Brand: "+brand+", Model: "+model+",Year: "+year+", Color "+color
                +"\nNumber of tires: "+numberofTires+"\nhasEngine: "+hasEngine
                +"\nHas Wheel: "+hasWheel+"\nHasAirbug: "+hasAirbag;
    }


}
