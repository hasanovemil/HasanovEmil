package day11_Nestedif_Ternary;

public class Nestedif {
    public static void main(String[] args) {
        int score = 75;
       String result = "";

       if(score >= 0 && score <= 100){
        if(score>=90 && score<= 100){
            result = "A";
        }else if(score >=80 && score<=89){
            result = "B";
        }else if(score>=70 && score<=79){
            result = "C";
        }else if(score>=60 && score<=69){
            result = "D";
        }else{
            result = "F";
        }
       }else{
           result = "Invalid";
       }

        System.out.println(result);
        System.out.println("==================================================");



    }


}
