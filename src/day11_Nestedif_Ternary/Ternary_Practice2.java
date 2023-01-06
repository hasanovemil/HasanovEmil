package day11_Nestedif_Ternary;

public class Ternary_Practice2 {
    public static void main(String[] args) {
        int number = 100;
        String result = "";
        if(number > 0){
            result = "Positive";
        }else if(number < 0){
            result = "Negative";
        }else{
            result = "zero";
        }
        System.out.println(result);

     String result2 = (number > 0)? "Positive" :(number < 0)? "Negative" : "zero";

        System.out.println(result2);

        System.out.println("=======================================");
        int age = 18;
                String result3 = (age > 15)? "He can vote" : "He can not vote";
        System.out.println(result3);
        System.out.println("==============================================");
        int num1 = 250;
        int num2 = 250;
        String result4 = (num1 == num2)? "num1 Equal num2" : "num1 is less than num2";
        System.out.println(result4);


    }





}
