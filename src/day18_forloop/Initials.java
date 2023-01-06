package day18_forloop;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstname = scan.next();
        System.out.println("Enter last name: ");
        String lastname = scan.next();

        System.out.println(firstname.substring(0,1).concat(lastname.substring(0,1)));
        System.out.println("=================================================");

        char ch1 = firstname.charAt(0);
        char ch2 = lastname.charAt(0);
        System.out.println((""+ ch1+"."+ch2).toUpperCase() );





    }
}
