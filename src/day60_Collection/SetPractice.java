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
        System.out.println("==========================================");

        String[] names2 = {"Emil","Rashad","Gunel","Emil","Emil","Emil","Emil","Emil"};

        names2 = new LinkedHashSet<>(Arrays.asList(names2)).toArray(new String[0]);

        System.out.println(Arrays.asList(names2));

        System.out.println("======================================");

        Integer[] numbers = {1,1,1,1,2,2,2,2,0,0,0,0,3,3,3,3,4,4,4,4};

        numbers = new LinkedHashSet<>(Arrays.asList(numbers)).toArray(new Integer[0]);

        System.out.println(Arrays.asList(numbers));




    }

}
