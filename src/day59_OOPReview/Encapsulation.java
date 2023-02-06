package day59_OOPReview;

import java.time.LocalDate;

public class Encapsulation {

    private int ssn;

    private final LocalDate Published = LocalDate.of(2020,9,3);

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public LocalDate getPublished() {
        return Published;
    }
}
