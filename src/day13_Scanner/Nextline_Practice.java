package day13_Scanner;

import java.util.Scanner;

public class Nextline_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your building number: ");
         int buildingnumber = scan.nextInt();
        scan.nextLine();
         System.out.println("Enter your street name: ");
        String streetname = scan.nextLine();
        System.out.println(buildingnumber + " " + streetname);



    }





}
