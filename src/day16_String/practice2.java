package day16_String;

import java.util.Scanner;

public class practice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        boolean r1 = word.endsWith("ly");
        boolean r2 = word.endsWith("ly");
        if(r1==r2){
            System.out.println("Really");
        }else{
            System.out.println("Never mind");
        }



    }

}
