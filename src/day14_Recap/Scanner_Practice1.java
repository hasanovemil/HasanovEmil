package day14_Recap;

import java.util.Scanner;

public class Scanner_Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender:");
        String gender = input.next();
        System.out.println("Enter your age:");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Enter your country name:");
        String countryname = input.nextLine();
        System.out.println("Enter your zip code:");
        int zipcode = input.nextInt();
        input.nextLine();
        System.out.println("Enter your fullname");
        String fulname = input.nextLine();


    }




}
