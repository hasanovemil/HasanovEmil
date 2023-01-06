package day18_forloop;

import java.util.Scanner;

public class String_practice1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstname = scan.next().substring(0,1);
        System.out.println("Enter last name: ");
        String lastname = scan.next().substring(0,1);
        String fullname = firstname + ""+lastname;
        System.out.println(fullname);


    }
}
