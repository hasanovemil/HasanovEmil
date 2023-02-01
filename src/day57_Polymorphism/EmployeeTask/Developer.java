package day57_Polymorphism.EmployeeTask;

public class Developer extends Employee {

    public Developer(String name, int ID, String jobtitle, double salary, char gender) {
        super(name, ID, jobtitle, salary, gender);
    }

    @Override
    public void work() {
        System.out.println("Developer "+name+" is working ");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
