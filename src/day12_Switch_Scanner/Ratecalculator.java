package day12_Switch_Scanner;

import java.util.Scanner;

public class Ratecalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();
        System.out.println("How many hours do you work in a week: ");
        int weeklyhour = input.nextInt();
        int totalhours = weeklyhour * 52;
        double hourlyrate = salary / totalhours;
        System.out.println("You hourly rate is " + hourlyrate );






    }





}
