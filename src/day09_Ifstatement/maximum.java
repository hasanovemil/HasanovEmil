package day09_Ifstatement;

public class maximum {
    public static void main(String[] args) {
   int a = 200;
   int b = 500;
   int c = 100;

   boolean aismax = a > b && a > c;
   boolean bismax = b > a && b > c;
   boolean cismax = c > a && c > b;

   int max = 0;
   if(aismax){
       max = a;
   }
   if(bismax){
       max = b;
   }
   if(cismax){
    max = c;
}
        System.out.println(max);

    }




}
