package day32_MethodOverloading;
import Library.Util;

import java.util.Arrays;

public class MethodCalls {

    public static void main(String[] args) {

       String firstname = "raSHaD";
       String lastname = "maMMADLI";

       String fullname;
       fullname = Util.formatFullName(firstname,lastname);
        System.out.println(fullname);
        String uniques = Util.uniques(fullname.toLowerCase());
        System.out.println(uniques);
        String reverse = Util.reverse(fullname);
        System.out.println(reverse);

        System.out.println("==========================================");
         int[] a = {200,300,400,500,600,700,800};
         int n1 = 900;
         a = Util.AddElements(a,n1);
        System.out.println(Arrays.toString(a));



    }
}
