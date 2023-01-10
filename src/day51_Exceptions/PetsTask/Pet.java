package day51_Exceptions.PetsTask;

public class Pet {

    public String name;
    public int age;
    public char gender;
    public String breed;
    public String color;

    public Pet(String name, int age, char gender, String breed, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
        this.color = color;
    }

    protected void eat(){
        System.out.println(name+" is eating chocolate");
    }

    protected void drink(){
        System.out.println(name+" is drinking milk");
    }

    protected void sleep(){
        System.out.println(name+" is sleeping on the floor");
    }


    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
