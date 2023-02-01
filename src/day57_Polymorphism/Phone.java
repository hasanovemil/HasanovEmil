package day57_Polymorphism;

public abstract class Phone {

    public String brand,model,size;
    public double price;

    public Phone(String brand, String model, String size, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        if(price<=0){
            throw new RuntimeException("Price of phone cannot be negative or 0");
        }
        this.price = price;
    }

    public abstract void texting(long phonenumber);
    public abstract void calling(long phonenumber);






}
