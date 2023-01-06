package day15_String;

import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstname = scan.next().toUpperCase();
        System.out.println("Enter your last name");
        String lastname = scan.next().toUpperCase();
        String fullname = firstname + ""+lastname;

        System.out.println("fullname " + fullname);



    }

}
