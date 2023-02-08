package day60_Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        String str = "aaaaaaaaabbbbbbbbbcccccccccddddddddeeeeeeee";

        String[] arr = str.split("");

        System.out.println(Arrays.toString(arr));

        Set<String> str1 = new HashSet<>();

        str1.addAll(Arrays.asList(arr));

        System.out.println(str1);

        Set<String> strx = new LinkedHashSet<>();
        String str10 = "zzzzzzzzzyyyyyyyyyxxxxxxxxx";
        strx.addAll(Arrays.asList("str10"));
        str10 = new LinkedHashSet<>(Arrays.asList(str10.split(""))).toString();
        str10 = str10.replace("[","").replace(",","").replace("]","");
        System.out.println(str10);



    }

}
