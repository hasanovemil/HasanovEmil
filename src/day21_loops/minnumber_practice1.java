package day21_loops;

import java.util.Scanner;

public class minnumber_practice1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 2147483647;
        for(int i =1;i <=5;i++){
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            if(num < min){
                min = num;
            }
        }
        System.out.println(min);


    }
}
