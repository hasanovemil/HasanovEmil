package day13_Scanner;

import java.util.Scanner;

public class Nextline_VS_nextmethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your salary");
        double salary = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter your full name: ");
        String fullname = scan.nextLine();
        System.out.println("Salary" + salary);
        System.out.println("Fullname" + fullname);



    }





}
