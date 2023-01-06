package day15_String;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstname = scan.next();

        System.out.println("Enter your last name:");
        String lastname = scan.next();

        String fullname = firstname.concat(" ".concat(lastname));
        System.out.println("Your fullname is "  .concat(fullname));



    }

}
