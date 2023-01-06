package day37_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Digits_Letters {
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','b','c','d','1','2','3','@','!'));

        chars.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(chars);
        System.out.println("=====================================");

        ArrayList<Character> list = new ArrayList<>();
        list.addAll( Arrays.asList('a','b','c','d','1','2','3','@','!' ));

        ArrayList<Character> digits = new ArrayList<>();
        digits.addAll(list);
        digits.removeIf(p -> ! Character.isDigit(p));
        System.out.println("Digits " + digits);

        ArrayList<Character> letters = new ArrayList<>();
        letters.addAll(list);
        letters.removeIf(p -> ! Character.isLetter(p));
        System.out.println("letters " + letters);

        ArrayList<Character> specialChar = new ArrayList<>();
        specialChar.addAll(list);
        specialChar.removeAll(letters);
        specialChar.removeAll(digits);
        System.out.println("specialChar " + specialChar);



    }
}
