package day56_Abstraction.PhoneTask;

public abstract class Phone {

    public String brand;
    public String model;
    public double price;
    public String size;

    public abstract void calling(long phonenumber);

    public abstract void calling(long num1,long num2);
    public abstract void texting(long phonenumber);

    public abstract void texting(long num1,long num2);

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }

    public Phone(String brand, String model, double price, String size) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
    }


}
