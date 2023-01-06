package day19_Forloopcontinue;

import java.util.Scanner;

public class Sumofnums {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int sum = 0;
        if(num > 0){
            for(int i = 0;i<=num;i++){
                sum +=i;
            }
            System.out.println(sum);


        }

    }
}
