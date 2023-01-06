package day21_loops;

public class Dividetwonumbers {

    public static void main(String[] args) {
        int a = 21;
        int b = 4;
        int count =0;
        while(a >= b){
            a -= b;
            count++;
        }
        System.out.println(count + " with remainder " +a );


    }
}
