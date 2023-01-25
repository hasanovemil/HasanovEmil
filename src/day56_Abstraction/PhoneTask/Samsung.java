package day56_Abstraction.PhoneTask;

public final class Samsung extends Phone {


    public Samsung( String model, double price, String size) {
        super("Samsung", model, price, size);
        if(price <= 0 || price > 1200){
            throw new RuntimeException("Invalid price: "+price);
        }
    }

    @Override
    public void calling(long phonenumber) {
        System.out.println("Samsung is calling: "+phonenumber);
    }

    @Override
    public void calling(long num1, long num2) {
        calling(num1);
        calling(num2);
    }

    @Override
    public void texting(long phonenumber) {
        System.out.println("Samsung is texting: "+phonenumber);
    }

    @Override
    public void texting(long num1, long num2) {
        texting(num1);
        texting(num2);
    }

    public void freezing(){
        System.out.println("Samsung is freezing");
    }

    @Override
    public String toString() {
        return "Samsung Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
