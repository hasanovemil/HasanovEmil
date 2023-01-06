package day09_Ifstatement;

public class alcohol {
    public static void main(String[] args) {
        boolean hasid = true;
        int age = 25;

        boolean eligible = hasid && age <=30;
        String result = "";

        if(eligible==true){
            //System.out.println("Eligible to buy alcohol");
            result = "Eligible to buy alcohol";
        }
        if(eligible==false){
            //System.out.println("You buy your milk");
            result = "You are not old enough to buy alcohol";
        }
        System.out.println(result);


    }




}
