package day45_Constructor;

public class SalaryCalculator {

    double hourlyRate;
    int weeklyHour;
    double stateTaxrate;
    double federalTaxrate;

    public SalaryCalculator(double hourlyRate, int weeklyHour, double stateTaxrate, double federalTaxrate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHour = weeklyHour;
        this.stateTaxrate = stateTaxrate;
        this.federalTaxrate = federalTaxrate;
    }

    public double salary(){
        return (hourlyRate*weeklyHour)*48;
    }

    public double stateTax(){
        return salary()*stateTaxrate;
    }

    public double federalTax(){
        return salary()*federalTaxrate;
    }

    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }

    public String toString(){
        return "Salary: "+salary()+"\nStatetax: "+stateTax()+"\nfederalTax"+federalTax()+"\nSalary After Tax: "+salaryAfterTax();
    }


}

