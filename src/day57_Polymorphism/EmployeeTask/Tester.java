package day57_Polymorphism.EmployeeTask;

public class Tester extends Employee {

    public Tester(String name, int ID, String jobtitle, double salary, char gender) {
        super(name, ID, jobtitle, salary, gender);
    }

    @Override
    public void work() {
        System.out.println("Tester "+name+" is working: ");
    }
}
