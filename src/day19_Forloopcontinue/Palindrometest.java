package day19_Forloopcontinue;

import java.util.Scanner;

public class Palindrometest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();
        String reversedstr = "";

        for( int i = word.length()-1; i >= 0;i--){
            reversedstr+=word.charAt(i);
        }

        System.out.println(reversedstr);
        System.out.println(word.equals(reversedstr));




}


}
