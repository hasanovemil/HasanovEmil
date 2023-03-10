package day41_toString;

public class Developer {

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

    public void coding(){
        System.out.println(name+" is coding");
    }
    public void fixBugs(){
        System.out.println(name+" is crying");
    }
    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Age: "+age+",Salary: "+salary;
    }


}
class DeveloperObject{
    public static void main(String[] args) {

        Developer[] developers = {new Developer(),new Developer(),new Developer(),new Developer(),new Developer(),new Developer()};

        developers[0].setInfo("Emil",10000,"Male",25);
        developers[1].setInfo("Rashad",20000,"Male",26);
        developers[2].setInfo("Gunel",30000,"Female",27);
        developers[3].setInfo("Aida",40000,"Female",28);
        developers[4].setInfo("Rustam",50000,"Male",29);
        developers[5].setInfo("Rasim",60000,"Male",20);

        for( Developer each : developers){
            each.coding();
        }
        System.out.println("===========================================");
        for(int i = 0; i <= developers.length-1;i++){
            developers[i].fixBugs();
        }
    }
}
