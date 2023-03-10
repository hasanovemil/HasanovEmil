package day56_Abstraction.PhoneTask;

public final class Iphone extends Phone {


    public Iphone(String model, double price, String size) {
        super("Iphone", model, price, size);
        if(price <=0 || price >1500){
            throw new RuntimeException("Invalid price: "+price);
        }
    }

    @Override
    public void calling(long phonenumber) {
        System.out.println("Iphone is calling: "+phonenumber);
    }

    @Override
    public void calling(long num1, long num2) {
        calling(num1);
        calling(num2);
    }

    @Override
    public void texting(long phonenumber) {
        System.out.println("Iphone is texting: "+phonenumber);
    }

    @Override
    public void texting(long num1, long num2) {
        texting(num1);
        texting(num2);
    }

    @Override
    public String toString() {
        return "Iphone phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                '}';
    }

    public void faceTiming(long phoneNumber){
        System.out.println("Iphone is facetiming with "+phoneNumber);
    }
    public void faceTiming(long num1,long num2){
           faceTiming(num1);
           faceTiming(num2);
    }







}
