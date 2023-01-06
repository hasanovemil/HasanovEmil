package day47_Encapsulation;

public class CapitalOneEmployees {

    public String employeename;
    public int age;
    public String jobtitle;




    public CapitalOneEmployees(String employeename,int age,String jobtitle){
        this.employeename = employeename;
        this.age = age;
        this.jobtitle = jobtitle;
    }

    public static String companyname;

    static{
        companyname = "capital one";
    }

    private int ID;
    private double salary;
    private String address;


    public void setID(int ID){
        this.ID = ID;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public int getID(){
        return ID;
    }
    public double getSalary(){
        return salary;
    }
    public String getAddress(){
        return address;
    }


    public String toString(){
        return "Name: "+employeename+" ,Age: "+age+" ,Jobtitle: "+jobtitle+",ID: "+getID()+",Salary: "+getSalary();
    }






}


