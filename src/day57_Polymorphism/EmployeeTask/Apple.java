package day57_Polymorphism.EmployeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {

    public static void main(String[] args) {

        Employee tester1 = new Tester("Emil",123456,"Scientist",50000,'M');
        Employee tester2 = new Tester("Rashad",785698,"Manager",60000,'M');

        Employee developer1 = new Developer("Gunel",475869,"Doctor",70000,'F');
        Employee developer2 = new Developer("Aida",126978,"Doctor",80000,'F');

        Employee scrummaster1 = new ScrumMaster("Rustam",457836,"Enginner",56000,'M');

        ArrayList<Employee> scrumTask = new ArrayList<>();

        scrumTask.addAll(Arrays.asList(tester1,tester2,developer1,developer2,scrummaster1));

        for(Employee each : scrumTask){
            System.out.println(each);
        }











    }
}
