package day54_Abstraction;

import java.time.LocalDate;

public final class Tester extends Employee {

    public Tester(String name, char gender, LocalDate DOfB, String jobtitle, double salary){
        super(name, gender, DOfB, jobtitle, salary);

    }
    public void findBug(){
        System.out.println(name + " found a bug");

    }


}
