package day42_static;

public class Developer {
    String name;
    char gender;
    long employeeID;
    String jobtitle;
    double salary;

    public void setInfo( String name,char gender,long employeeID, String jobtitle,double salary){
        this.name = name;
        this.gender = gender;
        this.employeeID = employeeID;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }

    public void coding(){
        System.out.println(name+ "is coding");
    }

    public void fixBug(){
        System.out.println(name +" is fixing bug");
    }

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Jobtitle: "+jobtitle+" ,Salary: "+salary+",EmployeeID: "+employeeID;
    }
}
