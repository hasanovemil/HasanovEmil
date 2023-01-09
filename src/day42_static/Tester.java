package day42_static;

public class Tester {

    String name;
    char gender;
    long employeeID;
    String jobtitle;
    double salary;

    public void setInfo(String name,char gender,long employeeID,String jobtitle,double salary){
        this.name = name;
        this.employeeID = employeeID;
        this.jobtitle = jobtitle;
        this.salary = salary;
        this.gender = gender;
    }
    public void smokeTesting(){
        System.out.println(name+"smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+"is creating ticket");
    }
    public String toString(){
        return "Name:"+name+",Gender:"+gender+",Jobtitle:"+jobtitle+",Salary:"+salary+",EmployeeID:"+employeeID;
    }








}
