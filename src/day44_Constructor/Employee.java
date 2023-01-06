package day44_Constructor;

public class Employee {
    String name;
    int ID;
    int ssn;
    String jobtitle;
    double salary;
    char gender;

    static boolean isemployed = true;
    static boolean hasSalary = true;

    static{
        isemployed = true;
        hasSalary = true;
    }

    public void setEmployeeInfo(String name,int ID,int ssn,String jobtitle,double salary,char gender){
        this.name = name;
        this.ID = ID;
        this.ssn = ssn;
        this.jobtitle = jobtitle;
        this.salary = salary;
        this.gender = gender;


    }

    public String toString(){
        return "Name: "+name+"\n Gender: "+gender+"\n ID: "+ID+"/nSSN: "+ssn+"\n Jobtitle: "+jobtitle+
                "\n Salary: "+salary;
    }
}
