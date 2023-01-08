package day49_Inheritance.ScrumTeamTask;

public class Developer extends Employee {

    public Developer(String name,int age,char gender,double salary,int ID,String jobtitle) {
           setInfo(name, age, gender, salary, ID, jobtitle);
    }

    public void coding(){
        System.out.println(name + " is developing code,while hitting his head to the wall");
    }
    public void fixBugs(){
        System.out.println(name + " is fixing Bug while cursing the Tester");
    }
}
