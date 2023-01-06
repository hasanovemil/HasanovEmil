package day09_Ifstatement;

public class minimum {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 300;
        int d = 400;
        int e = 500;
        boolean aismin = a < b && a < c && a < d && a < e;
        boolean bismin = b < a && b < c && b < d && b < e;
        boolean cismin = c < a && c < b && c < d && c < e;
        boolean dismin = d < a && d < b && d < c && d < e;
        boolean eismin = e < a && e < b && e < c && e < d;

        int min = 0;
        if(aismin){
            min = a;
        }
        if(bismin){
            min = b;
        }
        if(cismin){
            min = c;
        }
        if(dismin){
            min = d;
        }
        if(eismin){
            min = e;
        }
        System.out.println(min);

    }




}
