package day22_Nestedloop;

import java.util.Scanner;

public class Uppercaselowercase {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
         String word = scan.next();

         char ch1 = word.charAt(0);
         char ch2 = word.charAt(word.length()-1);
         boolean start = ch1 > 'A' && ch1 < 'Z';
         boolean end = ch2 > 'a' && ch2 < 'z';
         if(start == end){
             System.out.println("true");
         }else{
             System.out.println("false");
         }


    }
}
