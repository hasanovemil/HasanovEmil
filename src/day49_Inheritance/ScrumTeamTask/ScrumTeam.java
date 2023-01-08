package day49_Inheritance.ScrumTeamTask;

import java.util.ArrayList;

public class ScrumTeam {

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addDevelopers(Developer developer){
        developers.add(developer);
    }
}
