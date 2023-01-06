package day39_CustomClass;

public class Employee {

    String Name;
    char gender;
    String SSN;
    String jobtitle;
    double salary;

    public void setEmployeeInfo(String EmployeeName,char Employeegender,String EmployeeSSN,
                                String Employeejobtitle,double employeesalary ){
        Name = EmployeeName;
        gender = Employeegender;
        SSN = EmployeeSSN;
        jobtitle = Employeejobtitle;
        salary = employeesalary;

    }

    public void getEmployeeInfo(){
        System.out.println("Name: "+Name+",Gender: "+gender+",Jobtitle: "+jobtitle+",Salary: "+salary);
        System.out.println("SSN" + SSN.substring(SSN.length()-4));

    }






    
}
