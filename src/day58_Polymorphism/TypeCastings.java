package day58_Polymorphism;

import day57_Polymorphism.PhoneTasks.Iphone;
import day57_Polymorphism.PhoneTasks.Phone;
import day57_Polymorphism.PhoneTasks.Samsung;
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
      //  animal3.bark();

        Dog dog2 = (Dog) animal3;
        dog2.bark();
        System.out.println("=================================================");

        Iphone phone1 = new Iphone("12","6",1200);

        Phone phone2 = phone1;

        Phone phone3 = new Samsung("A53","8",1100);
        Samsung phone4 = (Samsung) phone3;

       // Iphone phone5 = (Iphone) phone3;













    }
}
