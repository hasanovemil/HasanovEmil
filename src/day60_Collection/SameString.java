package day60_Collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SameString {

    public static void main(String[] args) {
        String str1 = "abcabc";
        String str2 = "cab";
        Set<String> strxy = new LinkedHashSet<>();
        strxy.addAll(Arrays.asList("str1","str2"));
        str1 = new LinkedHashSet<>(Arrays.asList(str1.split(""))).toString();
        str2 = new LinkedHashSet<>(Arrays.asList(str2.split(""))).toString();
        System.out.println(str1);
        System.out.println(str2);
        if(str1.chars().count()==str2.chars().count()){
            System.out.println(true);
        }else {
            System.out.println(false);
        }








    }
}
