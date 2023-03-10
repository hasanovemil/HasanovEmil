package day58_Polymorphism.AnimalTask;



public class Dog extends Animal {


    public String dogName;

    public Dog(String dogName,int age, char gender) {
        super(age, gender);
        this.dogName = dogName;

    }

    public void eat(){
        System.out.println("Dog"+dogName+" is eating");
    }
    public void sleep(){
        System.out.println("Dog"+dogName+" is sleeping");
    }

    public void bark(){
        System.out.println("Dog" +dogName+" is barking");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}
