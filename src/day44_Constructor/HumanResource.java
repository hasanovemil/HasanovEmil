package day44_Constructor;

public class HumanResource {

    static Employee employee1;
    static Employee employee2;
    static Employee employee3;
    static Employee employee4;
    static Employee employee5;

    static{
        employee1 = new Employee();
        employee2 = new Employee();
        employee3 = new Employee();
        employee4 = new Employee();
        employee5 = new Employee();
        employee1.setEmployeeInfo("Emil",123456,45793661,"Scientist",10000,'M');
        employee2.setEmployeeInfo("Rashad",7896488,47512368,"Agriculture",20000,'M');
        employee3.setEmployeeInfo("Gunel",4762569,2369548,"Manager",30000,'F');
        employee4.setEmployeeInfo("Aida",124793366,8884566,"Doctor",40000,'F');
        employee5.setEmployeeInfo("Rustam",44125588,6357854,"Enginner",50000,'M');
    }




}
