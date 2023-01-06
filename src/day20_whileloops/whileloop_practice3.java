package day20_whileloops;

import java.util.Scanner;

public class whileloop_practice3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "Hasanov123";

        System.out.println("Enter a password: ");

        String input = scan.nextLine();
        while(!input.equals(password)){
            System.out.println("Please,re-enter a password");
            input=scan.nextLine();
        }

        System.out.println("Logged in");
    }
}
