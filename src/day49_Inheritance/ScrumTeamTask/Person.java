package day49_Inheritance.ScrumTeamTask;

public class Person {
    public String name;
    public int age;
    public char gender;


    public void setInfo(String name,int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private void eat(){
        System.out.println(name + " is eating ");
    }
    private void walk(){
        System.out.println(name + " is walking ");
    }
    private void sleep(){
        System.out.println(name + " is sleeping ");
    }







}
