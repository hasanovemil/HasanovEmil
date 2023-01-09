package day49_Inheritance.ScrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(Tester[] testers,Developer[] developers){
            addTesters(testers);
            addDevelopers(developers);
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeTester(int ID){
        testers.removeIf(p -> p.ID == ID);
    }

    public void removeDeveloper(int ID){
        developers.removeIf(p -> p.ID == ID);
    }

    public void removeTesterDeveloper(int testerID,int developerID){
         removeTester(testerID);
         removeDeveloper(developerID);
    }

    public String toString(){
        return "======================================================="+
                "\nDeveloper: "+developers.size()+
                "\nTester: "+testers.size()+
                "\nCapacity: "+((developers.size()+testers.size())*8)+" point (Dev.team * 8 days)"+
                "\nVelocity: "+ ((developers.size()+testers.size())*8)+" point for current Sprint(No days off)"+
                "=========================================================";







    }


}
