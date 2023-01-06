package day41_toString;

public class Tester {

    String name;
    double salary;
    String gender;
    int age;

    public void setInfo(String name,double salary,String gender,int age){
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Age: "+age+",Salary: "+salary;
    }


}
class Tester1{
    public static void main(String[] args) {
        Tester [] testers = { new Tester(),new Tester(),new Tester(),new Tester(),new Tester()};
        testers[0].setInfo("Xalid",500,"Male",20);
        testers[1].setInfo("Yaqub",600,"Male",21);
        testers[2].setInfo("Aida",700,"Female",22);
        testers[3].setInfo("Gunel",800,"Female",23);
        testers[4].setInfo("Rustam",900,"Male",24);

        for( Tester each : testers){
            System.out.println(each);
        }



    }
}
