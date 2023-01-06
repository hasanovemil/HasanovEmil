package day13_Scanner;

import java.util.Scanner;

public class Salaryaftertax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("annual salary");
        int salary = input.nextInt();
        System.out.println("state tax rate");
         double taxstaterate = input.nextDouble();
         double statetax = salary * taxstaterate;
        System.out.println("Federal tax rate: ");
         double federaltaxrate = input.nextDouble();
         double federaltax = salary * federaltaxrate;

         double salaryaftertax = salary - statetax - federaltax;
        System.out.println("You annual salary" + salary);
        System.out.println("Your state tax" + statetax);
        System.out.println("your federaltax" + federaltax);
        System.out.println("salary after tax" + salaryaftertax);





    }




}
