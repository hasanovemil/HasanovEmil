package day57_Polymorphism.PhoneTasks;

public class Iphone extends Phone implements AppleApp,Downloadable {

    public Iphone(String model, String size, double price) {
        super("Iphone", model, size, price);
    }

    @Override
    public void download() {
        System.out.println("Iphone is downloading app from: "+AppstoreName);
        if(price>1500){
            throw new RuntimeException("Iphone price cannot be greater than 1500");
        }
    }

    @Override
    public void texting(long phonenumber) {
        System.out.println("Iphone is texting: "+phonenumber);
    }

    @Override
    public void calling(long phonenumber) {
        System.out.println("Iphone is calling: "+phonenumber);
    }

    public void faceTiming(long phonenumber){
        System.out.println("Iphone is facetiming: "+phonenumber);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }


}
