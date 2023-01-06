package day08_LogicalOperators;

public class Minimum {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;
        boolean number = a<b && a <c;
        boolean number2 = b <a && b < c;
        boolean number3 = c <a&& c< b;
        if(number){
            System.out.println(a);
        }
        if(number2){
            System.out.println(b);
        }
        if(number3){
            System.out.println(c);
        }

    }








}
