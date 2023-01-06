package day46_ConstructorCalls;

public class Employee {
    String name;
    String jobtitle;
    int ID;
    double salary;


    public Employee(String name){
        this.name = name;
    }
    public Employee(String name,String jobtitle){
        this(name);
        this.jobtitle = jobtitle;

    }
    public Employee(String name,String jobtitle,int ID){
        this(name,jobtitle);
        this.ID = ID;
    }
    public Employee(String name,String jobtitle,int ID,double salary){
        this(name,jobtitle,ID);
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+name+
                "\n Job Title: "+jobtitle+
                "\n ID: "+ID+
                "\n Salary"+salary;
    }
}
