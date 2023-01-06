package day47_Encapsulation;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Emil",25,'M', LocalDate.of(1988,4,5).atStartOfDay());

        System.out.println(person1);

        person1.setSsn(56445444);
        person1.setID(123456);
        person1.setAddress("Ilham haciyev");

        System.out.println("SSN: " +person1.getSsn());
        System.out.println("ID: " +person1.getID());
        System.out.println("Address: " +person1.getAddress());

    }
}
