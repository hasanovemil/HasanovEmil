package day58_Polymorphism;

import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Cat;
import day58_Polymorphism.AnimalTask.Dog;

public class TypeCastings {
    public static void main(String[] args) {

        Dog dog1 = new Dog("A",2,'F');
        Cat cat1 = new Cat("A",2,'F');

        Animal animal = dog1;
        Animal animal2 = cat1;

        System.out.println("===================================================");

        Animal animal3 = new Dog("A",2,'M');
        Dog dog2 = (Dog) animal3;





    }
}
