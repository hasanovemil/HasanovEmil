package day47_Encapsulation;

import java.time.LocalDateTime;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDateTime DOB;

    public Person(String name,int age,char gender,LocalDateTime DOB){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.DOB = DOB;
    }

    private int ID;
    private long ssn;
    private String address;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
