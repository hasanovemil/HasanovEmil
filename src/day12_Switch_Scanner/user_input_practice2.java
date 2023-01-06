package day12_Switch_Scanner;

import java.util.Scanner;

public class user_input_practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = scan.nextInt();

        String result = (num>0)?"Postive" :(num<0)? "Negative" : "zero";
        System.out.println(result);




    }





}
