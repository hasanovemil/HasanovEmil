package day21_loops;

import java.util.Scanner;

public class minandmax_practice1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          int max = -99999999;
          int min = 99999999;

        for(int i = 0; i <= 5; i++){
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        System.out.println("maximum number" + max);
        System.out.println("minimum number" + min);


    }
}
