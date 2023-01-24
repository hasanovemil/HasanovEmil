package day54_Abstraction;



public  class Employee {

    public String name;
    final public char gender;
    public String jobtitle;
    public double salary;

    public Employee(String name, char gender, String jobtitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+name+" ,Gender: "+gender+", Jobtitle: "+jobtitle+", Salary: "+salary;

    }






}
