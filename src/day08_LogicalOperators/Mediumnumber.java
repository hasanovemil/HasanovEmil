package day08_LogicalOperators;

public class Mediumnumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;

        boolean aismed = (a>b && a<c) ;
        boolean bismed = (b>a && b<c);
        boolean cismed = (c>a && c<b);

        double med = 0;
        if(aismed)
            a = med;
        if(bismed)
            b= med;
        if(cismed)
            c= med;
        System.out.println(med);

    }








}
