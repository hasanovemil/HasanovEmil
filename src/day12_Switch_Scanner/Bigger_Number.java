package day12_Switch_Scanner;

public class Bigger_Number {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 20;
        double num3 = 30;

        boolean num1isbigger = num1 > num2 && num1 > num3;
        boolean num2isbigger = num2 > num1 && num2 > num3;
        boolean num3isbigger = num3 > num1 && num3 > num2;

        String result = "";
        result = num1isbigger ? "num1" :num2isbigger ?  "num2" :  "num3";
        System.out.println(result);



    }




}
