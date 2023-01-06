package day32_MethodOverloading;

public class MethodOverloading2 {

    public static void main(String[] args) {
          addition(10,20);
          addition(10,20,30);
          addition(10,20,30,40);

    }

    public static void addition2numbers(double a,double b){
        System.out.println(a+b);
    }
    public static void addition3numbers(double a,double b,double c){
        System.out.println(a+b+c);
    }
    public static void addition4numbers(double a,double b,double c,double d){
        System.out.println(a+b+c+d);
     }
     //===========================================================
     public static void addition(double a,double b){
         System.out.println(a+b);
    }
    public static void addition(double a,double b,double c){
        System.out.println(a+b+c);
    }
    public static void addition(double a,double b,double c,double d){
        System.out.println(a+b+c+d);
    }

}
