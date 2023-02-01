package day57_Polymorphism.PhoneTasks;

public class Samsung extends Phone implements AndroidApp,Downloadable{

    public Samsung(String model, String size, double price) {
        super("Samsung", model, size, price);
        if(price>1200){
            System.out.println("Price of samsung cannot be greater than 1200");
        }
    }

    @Override
    public void download() {
        System.out.println("Samsung is downloading android app:"+AppstoreName);
    }

    @Override
    public void texting(long phonenumber) {
        System.out.println("Samsung is texting: "+phonenumber);
    }

    @Override
    public void calling(long phonenumber) {
        System.out.println("Samsung is calling: "+phonenumber);
    }

    public void freezing(){
        System.out.println("Samsung is freezing");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
