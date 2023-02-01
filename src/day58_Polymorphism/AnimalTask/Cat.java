package day58_Polymorphism.AnimalTask;

import day58_Polymorphism.AnimalTask.Animal;

public class Cat extends Animal {
    public String catName;

    public Cat(int age, char gender, String catName) {
        super(age, gender);
        this.catName = catName;
    }

    public void eat(){
        System.out.println("Cat is eating");
    }
    public void sleep(){
        System.out.println("Cat is sleeping");
    }

    public void scratch(){
        System.out.println("Cat is scratching");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", gender=" + gender +
                '}';
    }
}
