package day16_String;

import java.util.Scanner;

public class checkwords1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String sentence = input.nextLine();
        if(sentence.length() > 5){
            System.out.println(sentence.substring(sentence.length()-5));
        }else{
            System.out.println(sentence);
        }


    }
}
