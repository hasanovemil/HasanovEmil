package day53_finalKeyword;

import java.time.LocalDate;

public class FinalVariable {

    public static void main(String[] args) {

        final LocalDate dateofbirth = LocalDate.of(1985,07,13);

       // dateofbirth = LocalDate.of(1991,06,26);

        System.out.println(dateofbirth);

        final long ssn = 1234567;
        //ssn = 456789;

        System.out.println(ssn);
    }
}
