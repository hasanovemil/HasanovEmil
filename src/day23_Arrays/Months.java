package day23_Arrays;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {
        String[] months = {"jan", "feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec" };
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12" );
        int n = scan.nextInt();
        System.out.println(months[n-1]);




    }
}
