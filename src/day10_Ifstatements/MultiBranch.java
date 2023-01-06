package day10_Ifstatements;

public class MultiBranch {
    public static void main(String[] args) {
        int number = 1000;
        String result = "";


        if(number > 0){
           // System.out.println(number + " is positive");
            result = number + " is positive";
        }else if(number < 0){
            //System.out.println(number + " is negative");
            result = number + " is negative";
        }else{
            //System.out.println(number + " is zero");
            result = number + " is zero";
        }
        System.out.println(result);




    }





}
