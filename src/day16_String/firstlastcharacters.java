package day16_String;

import java.util.Scanner;

public class firstlastcharacters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();
        char firstcharacter = word.charAt(0);
        char lastcharacter = word.charAt(word.length()-1);
        if(firstcharacter==lastcharacter){
            System.out.println("True");
        }else{
            System.out.println("false");
        }



    }



}
