package day57_Polymorphism.EmployeeTask;

public abstract class Employee {

    public String name;
    public int ID;
    public String jobtitle;
    public double salary;
    public char gender;

    public Employee(String name, int ID, String jobtitle, double salary, char gender) {
        this.name = name;
        this.ID = ID;
        this.jobtitle = jobtitle;
        this.salary = salary;
        this.gender = gender;
    }



    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
