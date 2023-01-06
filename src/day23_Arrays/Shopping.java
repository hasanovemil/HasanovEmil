package day23_Arrays;

public class Shopping {

    public static void main(String[] args) {
       String [] shoppinglist = new String[7];

       shoppinglist[0] = "toilet paper";
       shoppinglist[1] = "hand sanitizer";
       shoppinglist[4] = "eggs";
       shoppinglist[6] = "beer";
       shoppinglist[2] = "bread";
       shoppinglist[3] = "milk";
       shoppinglist[5] = "water";

       for( int i = 0; i<= shoppinglist.length-1;i++){
           System.out.println(shoppinglist[i]);
       }





    }
}
