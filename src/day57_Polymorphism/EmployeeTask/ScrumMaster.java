package day57_Polymorphism.EmployeeTask;

public class ScrumMaster extends Employee {


    public ScrumMaster(String name, int ID, String jobtitle, double salary, char gender) {
        super(name, ID, jobtitle, salary, gender);
    }

    @Override
    public void work() {
        System.out.println("Scrum Master "+name+" is working");
    }

    @Override
    public String toString() {
        return "ScrumMaster{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
