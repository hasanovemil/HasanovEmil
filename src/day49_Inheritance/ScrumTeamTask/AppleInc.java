package day49_Inheritance.ScrumTeamTask;

public class AppleInc {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Emil",25,'M',10000,123456,"SDET");
        Tester tester2 = new Tester("Rashad",27,'F',20000,654321,"SDET");
        Tester tester3 = new Tester("Gunel",30,'M',30000,135246,"SDET");

        Tester[] testers = {tester1,tester2,tester3};

        Developer developer1 = new Developer("Aida",35,'F',100,12,"Doctor");
        Developer developer2 = new Developer("Rustam",37,'M',200,50,"Enginner");
        Developer developer3 = new Developer("Rasim",38,'M',300,45,"Scientist");
        Developer developer4 = new Developer("Xalid",56,'M',400,98,"Scientist");

        Developer[] developers = {developer1,developer2,developer3,developer4};

        ScrumTeam scrum1 = new ScrumTeam(testers,developers);

        System.out.println(scrum1);

        Tester[] testers2 = {
                new Tester("A",2,'M',10,45,"C"),
                new Tester("B",3,'M',20,46,"D"),

        };
        Developer[] developers2 = {
                new Developer("D",4,'M',30,89,"F"),
                new Developer("E",5,'M',50,90,"G"),
                new Developer("P",8,'M',80,100,"R"),
        };

        ScrumTeam scrum2 = new ScrumTeam(testers2,developers2);
        System.out.println(scrum2);










    }
}
