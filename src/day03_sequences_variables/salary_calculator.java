package day03_sequences_variables;

public class salary_calculator {

    public static void main(String[] args) {
        int salary=100000;
        double tax=0.28;
        double totaltax = salary*tax;
        double salaryaftertax = salary - totaltax;
        System.out.println(salaryaftertax);
        System.out.println(totaltax);



    }




}
