package day15_String;

import java.util.Locale;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Hasanov Emil";
        char ch1 = name.charAt(0);
        System.out.println(ch1);
        char ch2 = name.charAt(5);
        System.out.println(ch2);
        int l = name.length();
        System.out.println(l);
        int lastindexnumber = name.length() - 1;
        System.out.println(lastindexnumber);
        char lastcharacter = name.charAt(lastindexnumber);
        System.out.println(lastcharacter);
        String schoolname = "Cybertek";
        schoolname = schoolname.concat(" School");
        System.out.println(schoolname);
        String name1 = "HASANOVEMIL";
        name1 = name1.toLowerCase();
        System.out.println(name1);
        String name2 = "getreddolburdan";
        name2 = name2.toUpperCase();
        System.out.println(name2);




    }







}
