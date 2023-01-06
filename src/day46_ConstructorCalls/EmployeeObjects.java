package day46_ConstructorCalls;

public class EmployeeObjects {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Emil","Scientist",123456789,10000);

        System.out.println(employee1);

        System.out.println("==============================================");

        Employee employee2 = new Employee("Rashad","QA");

        System.out.println(employee2);

    }
}
