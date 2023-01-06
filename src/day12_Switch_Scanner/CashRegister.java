package day12_Switch_Scanner;

import java.util.Scanner;

public class CashRegister {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("boxes the customer has bought:");
        int a = input.nextInt();
        System.out.println("price for each box: ");
        int b = input.nextInt();
        int c = a * b;
        System.out.println("cash the customer gives to the cashier " + c);



    }



}
