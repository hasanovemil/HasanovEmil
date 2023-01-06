package day42_static;

import java.util.ArrayList;
import java.util.Arrays;

class tester{
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

    public void smoketesting(){
        System.out.println(name +" smoke testing ");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }
    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Jobtitle: "+jobtitle+" ,Salary: "+salary+",EmployeeID: "+employeeID;
    }
}
class developer{
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
class scrumteam{
    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();
    String PO;
    String BA;
    String SM;

    public void setInfo (String PO,String BA,String SM){
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addTester(Tester[] testers){
        if(testers.length==0){
            return;
        }
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(long employeeID){
        testers.removeIf(p->p.employeeID==employeeID);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDeveloper(Developer[] developers){
        if(developers.length==0){
            return;
        }
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeDeveloper(long employeeID){
        developers.removeIf(p->p.employeeID==employeeID);
    }

    public String toString(){
        return testers.size()+" testers,"+ developers.size()+" developers,PO: "+PO+",BA:"+BA+",SM: "+SM;
    }

}
class capitalone{
    public static void main(String[] args) {

        Tester [] testers = {new Tester(),new Tester(),new Tester()};
        testers[0].setInfo("A",'F',4524325,"Doctor",50000.0);
        testers[1].setInfo("B",'M',44866645,"Enginner",60000.0);
        testers[2].setInfo("C",'F',46148552,"Scientist",60000.0);

        Developer[] developers = { new Developer(),new Developer(),new Developer(),new Developer(),new Developer()};
        developers[0].setInfo("Ali",'M',5555555,"teacher",5000);
        developers[1].setInfo("Rasim",'M',6666666,"manager",6000);
        developers[2].setInfo("Zumrud",'F',5666666,"nurse",7000);
        developers[3].setInfo("Aida",'F',7777777,"doctor",8000);
        developers[4].setInfo("Xalid",'M',88888,"veterian",9000);


        Scrumteam team1 = new Scrumteam();
        team1.setInfo("Emil","Rashad","Gunel");
        team1.addTester(testers);
        team1.addDeveloper(developers);

        System.out.println(team1);
        System.out.println("===================================================");

        for( Tester each : team1.testers  ){
            System.out.println(each.name +" : $"+each.salary);
        }
        System.out.println("==========================================");

        for( Developer each : team1.developers){
            System.out.println(each.name +" : $"+each.salary);
        }
        System.out.println("=============================================");
        team1.removeTester(4524325);
        team1.removeDeveloper(5666666);
        System.out.println(team1);
        System.out.println("===============================================");
        Developer dev1 = new Developer();
        dev1.setInfo("Orxan",'M',2113L,"Dev Lead",50000);
        team1.addDeveloper(dev1);
        System.out.println(team1);

        Scrumteam [] scrumteam = { team1,new Scrumteam(),new Scrumteam()};









    }
}






public class Warmup {


}
