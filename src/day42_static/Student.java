package day42_static;

public class Student {

    String name;
    int age;
    int groupNumber;
    char gender;

    static String schoolname = "Cybertek School";
    static String favoriteTeacher = "Emil";

    public void setInfo(String name,int age,int groupNumber,char gender){
        this.name = name;
        this.age = age;
        this.groupNumber = groupNumber;
        this.gender = gender;
    }

    public String toString(){
        return "School name: "+schoolname+"\nStudent name:"+name;
    }
}
