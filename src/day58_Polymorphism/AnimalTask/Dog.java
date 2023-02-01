package day58_Polymorphism.AnimalTask;

import day58_Polymorphism.AnimalTask.Animal;

public class Dog extends Animal {

    public String dogName;

    public Dog(int age, char gender) {
        super(age, gender);
        this.dogName = dogName;

    }

    public void eat(){
        System.out.println("Dog is eating");
    }
    public void sleep(){
        System.out.println("Dog is sleeping");
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
