package day17_Stringreview;

import java.util.Scanner;

public class practice12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name:");
        String word1 = input.next().toLowerCase();
        word1 = word1.substring(0,1).toUpperCase()+word1.substring(1);
        System.out.println("Enter last name");
        String word2 = input.next().toLowerCase();
        word2 = word2.substring(0,1).toUpperCase()+word2.substring(1);

        /*if(word1.charAt(word1.length()-1) == word2.charAt(0)){
            System.out.println(word1 + ""+word2.substring(1));
        }else{
            System.out.println("not print");
        }

         */

        String fullname = word1 + " " + word2;
        System.out.println("Your full name is: ");
        System.out.println(fullname);
        // EMIL HaSANov - Emil Hasanov
        boolean r= fullname.contains("Emil Hasanov");
        System.out.println(r);
        if (r){
            System.out.println("Emil yaxsi oglandir");}
        else{
            System.out.println("Emil apteke getmelidi");}




    }
}
