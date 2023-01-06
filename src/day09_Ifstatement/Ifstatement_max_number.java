package day09_Ifstatement;

public class Ifstatement_max_number {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;
        boolean max1 = a>b && a>c;
        boolean max2 = b>a && b>c;
        boolean max3 = c>a && c>b;

        double max = 0;

        if(max1){
            //System.out.println(a);
            max= a;
        }
        if(max2){
            //System.out.println(b);
            max=b;
        }
        if(max3){
            //System.out.println(c);
            max=c;
        }
        System.out.println(max + " is maximum number");
    }





}
