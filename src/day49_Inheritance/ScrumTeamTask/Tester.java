package day49_Inheritance.ScrumTeamTask;

public class Tester extends Employee {

    public Tester(String name,int age,char gender,double salary,int ID,String jobtitle) {
           setInfo(name, age, gender, salary, ID, jobtitle);

    }

    public void smokeTesting(){
        System.out.println(name+ " is running smoke test,while drinking Cofee!");
    }
    public void creatingTicket(){
        System.out.println(name + " is creating Ticket on Jira");
    }
}
