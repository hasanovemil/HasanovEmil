package day32_MethodOverloading;

import java.util.Scanner;

public class formatFullName {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine();
        String last = scan.nextLine();
      /*
        first = first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();

        String fullname = first +" "+last;
       */
        String fullname = formatFullName(first,last);

        System.out.println(fullname);
    }

    public static String formatFullName(String first,String last){
        first = first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();

        String fullname = first +" "+last;
        return fullname;
    }
}
