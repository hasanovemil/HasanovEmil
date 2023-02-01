package day57_Polymorphism;

public class Huawei extends Phone implements AndroidApp,AppleApp,Downloadable{

    public Huawei(String model, String size, double price) {
        super("Huawei", model, size, price);
        if(price>200){
            System.out.println("No way Huawei is worth more than 200");
        }
    }

    @Override
    public void download() {
        System.out.println("Huawei is downloading: "+AndroidApp.AppstoreName+AppleApp.AppstoreName);
    }

    @Override
    public void texting(long phonenumber) {
        System.out.println("Huawei is texting: "+phonenumber);
    }

    @Override
    public void calling(long phonenumber) {
        System.out.println("Huawei is calling: "+phonenumber);
    }

    public void stealInfo(){
        System.out.println("Huawei is stealing your info");
    }

    @Override
    public String toString() {
        return "Huawei{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
