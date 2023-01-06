package day47_Encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        CapitalOneEmployees employee1 = new CapitalOneEmployees("Emil",25,"Scientist");

        employee1.setID(123);
        employee1.setSalary(10000);
        employee1.setAddress("Ilham Haciyev");


        System.out.println(employee1.employeename);
        System.out.println(employee1.age);
        System.out.println(employee1.jobtitle);
        System.out.println(employee1.companyname);

        System.out.println(employee1.getID());
        System.out.println(employee1.getAddress());
        System.out.println(employee1.getSalary());

        System.out.println(employee1);



    }
}
