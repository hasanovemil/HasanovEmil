package Office_Hours.Practice_07_28_2020;

public class Method_Practice {
    public static void main(String[] args) {

        String name = "Hasanov Emil";
        String reversedname = reversedstr(name);

        System.out.println(reversedname);
        System.out.println("===============================");


        isPalindrome("level");
        isPalindrome("Emil");
        System.out.println("====================================");
        String[] names = {"Emil","Hasanov","Rasim"};
        for(String each : names){
            System.out.println(reversedstr(each));
            isPalindrome(each);
        }
    }

    public static String reversedstr(String str){

        String result = "";

        for(int i = str.length()-1;i >=0;i--){
            char ch = str.charAt(i);
            result += ch;
        }

        return result;
    }

    public static void isPalindrome(String str){
        String reversedstr = reversedstr(str);
        if(str.equalsIgnoreCase(reversedstr)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindorme");
        }
    }
}
