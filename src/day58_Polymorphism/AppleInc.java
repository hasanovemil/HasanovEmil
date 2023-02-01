package day58_Polymorphism;

import day57_Polymorphism.EmployeeTask.*;

import java.util.ArrayList;
import java.util.Arrays;



public class AppleInc {

    public static void main(String[] args) {

        Employee[] workers = {

              new Tester("Emil",12,"QA",100,'M'),
              new Tester("Rashad",12,"QA",200,'M'),
              new Tester("Gunel",12,"QA",1000,'F'),
              new Tester("Aida",12,"QA",2000,'F'),
              new Developer("Rustam",12,"QA",3000,'M'),
              new Developer("Xalid",12,"QA",4000,'M'),
              new Tester("Camal",12,"QA",5000,'M'),
              new Tester("Yaqub",12,"QA",6000,'M'),
              new Tester("Ali",12,"QA",7000,'M'),
              new Developer("Aqil",12,"QA",8000,'M'),
              new Developer("Sabir",12,"QA",9000,'M'),
              new Developer("Emil",12,"QA",10000,'M'),
              new ScrumMaster("Emil",12,"QA",20000,'M'),
              new Tester("Emil",12,"QA",30000,'M'),
              new Developer("Emil",12,"QA",40000,'M'),
              new Developer("Emil",12,"QA",50000,'M'),
              new Tester("Abdul",12,"QA",60000,'M'),
              new Tester("Abdul",12,"QA",70000,'M'),
              new Tester("Abdul",12,"QA",80000,'M'),
              new Tester("Abdul",12,"QA",90000,'M'),
        };

        ArrayList<Employee> scrumTeam = new ArrayList<>(Arrays.asList(workers));

        int countTester = 0;
        int countDeveloper = 0;
        int countScrumMaster = 0;

        for(Employee each: scrumTeam){
            if(each instanceof Tester){
                countTester++;
            }else if(each instanceof Developer){
                countDeveloper++;
            }else {
                countScrumMaster++;
            }
        }

        System.out.println("Tester: " + countTester);
        System.out.println("Developer: " + countDeveloper);
        System.out.println("ScrumMaster: " + countScrumMaster);



    }
}
