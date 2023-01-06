package day14_Recap;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number:");
        int buildingnumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Street address");
        String Street = scan.nextLine();
        System.out.println("City name");
        String cityname = scan.next();
        System.out.println("state name");
        String statename = scan.next();
        System.out.println("zip code");
        int zipcode = scan.nextInt();
        scan.nextLine();
        System.out.println("Fullnameofperson");
        String Fullnameofperson = scan.nextLine();




    }





}
