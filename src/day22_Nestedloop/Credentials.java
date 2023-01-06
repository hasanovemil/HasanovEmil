package day22_Nestedloop;

import java.util.Scanner;

public class Credentials {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your user name:");
        String u = scan.next();

        System.out.println("Enter your password: ");
        String p = scan.next();

        int attempt = 0;

        while(!(u.equals("emil-2035") && p.equals("hasanov"))){
            if(attempt==3){
                System.out.println("your account is locked: ");
                System.exit(0);
            }

            System.out.println("Invalid user name or password,please re-enter: ");
            System.out.println("enter your user name: ");
            u= scan.next();

            System.out.println("enter your password: ");
            p=scan.next();

            attempt++;


        }


        System.out.println("Logged in");




    }
}
