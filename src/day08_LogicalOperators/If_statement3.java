package day08_LogicalOperators;

public class If_statement3 {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 1000;

        boolean aisMAx = a>b && a>c;
        boolean bisMax = b>a && b>c;
                //aisMAx==false && b>c;

        boolean Cismax = c>a && c>b;
        if(aisMAx){
            System.out.println(a);
        }
if(bisMax){
    System.out.println(b);
}
 if(Cismax){
     System.out.println(c);
 }



    }








}
