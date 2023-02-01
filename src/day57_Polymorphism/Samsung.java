package day57_Polymorphism;

public class Samsung extends Phone implements AndroidApp{

    public Samsung(String model, String size, double price) {
        super("Samsung", model, size, price);
    }

    @Override
    public void download() {

    }

    @Override
    public void texting(long phonenumber) {

    }

    @Override
    public void calling(long phonenumber) {

    }
}
