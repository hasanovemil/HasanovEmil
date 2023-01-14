package day53_finalKeyword;

import java.time.LocalDate;

public class FinalVariable {

    final static String eyecolor = "brown";
    final String bloodtype = "A";

    public static void main(String[] args) {

        final LocalDate dateofbirth = LocalDate.of(1985,07,13);

       // dateofbirth = LocalDate.of(1991,06,26);

        System.out.println(dateofbirth);

        final long ssn = 1234567;
        //ssn = 456789;

        System.out.println(ssn);

        final double PI = 3.14;
         // PI = 2.14;
        System.out.println(PI);

        final char gender = 'M';
        //gender = 'F';

        final String birthplace = "Azerbaijan";
        //birthplace = "USA";






    }
}
