package day54_Abstraction;

import java.time.LocalDate;

public class Employee {

    public String name;
    final public char gender;
    final public LocalDate DOfB;
    public String jobtitle;
    public double salary;

    public Employee(String name, char gender, LocalDate DOfB, String jobtitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DOfB = DOfB;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }






}
