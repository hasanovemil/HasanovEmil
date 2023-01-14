package Office_Hours.Practice_09_09_2020;

public class Samsung extends Phone {



    public Samsung(String model, double price) {
        super(model, price);
    }

    static {
        brand = "Samsung";
        madeIn = "Korea";
    }

    @Override
    protected void call(long phonenumber) {
        System.out.println("Samsumg "+model+" is calling: "+phonenumber);
    }

    @Override
    protected void text(long phonenumber) {
        System.out.println("Samsung "+model+ " is texting to "+phonenumber);
    }


}
