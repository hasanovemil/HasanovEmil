package day08_LogicalOperators;

public class alcohol {
    public static void main(String[] args) {
        boolean hasID = true;
        int age = 25;
        boolean eligible = hasID && age>=21;
        if(eligible == true){
            System.out.println("you buy achool");

        }
if ( eligible ==false){
    System.out.println("you buy your milk");
}




    }








}
