package day09_Ifstatement;

public class Medium_number {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 300;
        int d = 400;
        int e = 500;

        boolean aismed = a > b && a > c && a < d && a < e;
        boolean bismed = b > a && b > c && b < d && b < e;
        boolean cismed = c > a && c > b && c < d && c < e;
        boolean dismed = d > a && d > b && d < c && d < e;
        boolean eismed = e > a && e > b && e< c && e < d;

        int med = 0;
        if(aismed){
            med = a;
        }
        if(bismed){
            med = b;
        }
        if(cismed){
            med = c;
        }
        if(dismed){
            med = d;
        }
        if(eismed){
            med = e;
        }
        System.out.println(med);

    }






}
