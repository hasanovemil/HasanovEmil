package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setEmployeeInfo("EMil",'M',"12345678",
                "QA",15000);
        employee2.setEmployeeInfo("Rashad",'M',"45618911146",
                "Agriculture",12000);
        employee3.setEmployeeInfo("Gunel",'F',"14853679",
                "Manager",10000);
        employee4.setEmployeeInfo("Aida",'F',"47896357",
                "Doctor",60000);
        employee5.setEmployeeInfo("Rasim",'M',"63589665",
                "Scientist",100000);

        ArrayList<Employee> list = new ArrayList<>();
        list.addAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5));


        double max= Integer.MIN_VALUE;
        String name = "";
        for(Employee each: list){
            double eachsalary = each.salary;
            if( eachsalary > max){
                max = eachsalary;
                name= each.Name;
            }
        }
        System.out.println("Maximum salary: " + max);
        System.out.println("Name: " + name);
        System.out.println("========================================");

        list.removeIf(p -> p.salary < 15000);
        for(Employee each : list){
            each.getEmployeeInfo();
        }









    }
}
