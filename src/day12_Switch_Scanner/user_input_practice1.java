package day12_Switch_Scanner;

import java.util.Scanner;

public class user_input_practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
       double num =  scan.nextDouble();
       String result = (num%2==0)? "even" : "Odd";
        System.out.println(result);




    }




}
