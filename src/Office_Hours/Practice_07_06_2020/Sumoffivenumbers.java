package Office_Hours.Practice_07_06_2020;

import java.util.Scanner;

public class Sumoffivenumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for(int i = 10;i<=50;i+=10){
            System.out.println("Enter a number: ");
            int num1 = scan.nextInt();
            sum+=num1;
        }

        System.out.println(sum);



    }
}
