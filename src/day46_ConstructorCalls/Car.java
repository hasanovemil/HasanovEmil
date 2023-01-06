package day46_ConstructorCalls;

public class Car {
    String brand;
    String model;
    int year;
    double price;
    String color;

    public Car(String brand) {
         this.brand = brand;
    }
    public Car(String brand,String model){
        this.brand = brand;
        this.model = model;
    }
    public Car(String brand,String model,int year){
        this(brand,model);
        this.year = year;
    }
    public Car(String brand,String model,int year,double price){
        this(brand,model,year);
        this.price = price;
    }
    public Car(String brand,String model,int year,double price,String color){
        this(brand,model,year,price);
        this.color = color;
    }
    public String toString(){
        return "Brand:"+brand+
                "\n model:"+model+
                "\n year: "+year+
                "\n price: "+price+
                "\n color:"+color;

    }
}

