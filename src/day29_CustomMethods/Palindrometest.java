package day29_CustomMethods;

public class Palindrometest {
    public static void main(String[] args) {

        palindrome("Emil");
    }

    public static void palindrome(String word){
        String reversed = "";
        for(int i = word.length()-1;i >=0;i--){
            reversed += word.charAt(i);
        }
        System.out.println(reversed.equalsIgnoreCase(word));

    }

    
}
