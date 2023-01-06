package day15_String;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstname = input.next();
        char ch1 = firstname.charAt(0);
        System.out.println("enter your lastname: ");
        String lastname = input.next();
        char ch2 = lastname.charAt(0);
        System.out.println("You initial is "+ch1 +"."+ch2);



    }


}
