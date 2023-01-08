package day49_Inheritance.ScrumTeamTask;

public class Employee extends Person {

    public double salary;
    public int ID;
    public String jobtitle;

    public void setInfo(String name,int age,char gender,double salary,int ID,String jobtitle){
          setInfo(name, age, gender);
          this.salary = salary;
          this.ID = ID;
          this.gender = gender;
    }
    public void work(){
        System.out.println(name + " is working ");
    }
    public String toString(){
        return "Name: "+name+",Age: "+age+", Gender: "+
                "\nSalary: "+salary+",ID: "+ID+",Jobtitle: "+jobtitle;
    }



}
