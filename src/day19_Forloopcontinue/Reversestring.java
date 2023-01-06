package day19_Forloopcontinue;

import java.util.Scanner;

public class Reversestring {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word: ");
        String word = scan.next();
        String result = "";
        for( int i = word.length()-1;i >=0; i--){
            result += word.charAt(i);
        }
        System.out.println(result);
    }

}
