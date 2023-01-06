package day41_toString;

public class Carpet {

    double width;
    double length;
    double unitprice;
    boolean isPersian;

    public void customorder(double width,double length,double unitprice,boolean isPersian){
        this.width=width;
        this.length=length;
        this.unitprice = unitprice;
        this.isPersian = isPersian;

    }
    public double calcCost(){
        double totalprice = (width*length)*unitprice;
        if(isPersian){
            totalprice+=200;
        }

        return totalprice;

    }
    public void getcarpetinfo(){
        System.out.println("====================================");
        System.out.println("width " + this.width);
        System.out.println("length " + this.length);
        System.out.println("Unit price " + unitprice);
        System.out.println("Persian carpet " + isPersian);
        System.out.println("Total price " + calcCost());


        System.out.println("======================================");
    }

}
