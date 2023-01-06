package day40_CustomClassPractice;

public class Offer {

    double salary;
    String state;
    boolean hasPTO;
    boolean isFulltime;
    boolean isWFH;
    String jobtitle;
    boolean hasBenefit;

    public void setOfferInfo(double salary,String state,boolean hasPTO,
                             boolean isFulltime,boolean isWFH,String jobtitle,boolean hasBenefit){
        this.salary = salary;
        this.state = state;
        this.hasPTO = hasPTO;
        this.isFulltime = isFulltime;
        this.isWFH = isWFH;
        this.jobtitle = jobtitle;
        this.hasBenefit = hasBenefit;
    }

    public void getOfferInfo(){
        System.out.println("==========================================");
        System.out.println("Salary: " + salary);
        System.out.println("Jobtitle " + jobtitle);
        System.out.println("Location " + state);
        System.out.println("============================================");
    }



}
