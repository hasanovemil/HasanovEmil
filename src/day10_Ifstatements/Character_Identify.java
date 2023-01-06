package day10_Ifstatements;

public class Character_Identify {
    public static void main(String[] args) {
        char character = '@';
        boolean isalphabetic = (character >=65 && character <= 90) || (character >=97 && character <=122);
        boolean isdigit = (character >=48 && character <= 57);
        boolean isspecialcharacter = !isalphabetic && !isdigit;
        String alphabet = "";

        if(isalphabetic){
            alphabet = character + " is alphabetic character";
        }
            //System.out.println(character + " is alphabetic character");
        else {
            alphabet = character + " is not alphabetic character";
            // System.out.println(character + " is not alphabetic character");
        }
        System.out.println(alphabet);
        String digit = "";
        if(isdigit){
            digit= character + " is a digit";
        }else{
            digit = character + " is not a digit";
        }
        System.out.println(digit);
        String specialcharacter = "";
        if(isspecialcharacter){
            specialcharacter = character + "is a special character";
        }else {
            specialcharacter = character + " is not a special character";
        }
        System.out.println(specialcharacter);


    }




}
