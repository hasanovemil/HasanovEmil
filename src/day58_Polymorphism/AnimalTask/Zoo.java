package day58_Polymorphism.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

         Dog dog1 = new Dog("Winston",5,'M');

         dog1.sleep();
         dog1.eat();
         dog1.bark();

        System.out.println(dog1.dogName);
        System.out.println(dog1.age);
        System.out.println(dog1.gender);



        System.out.println("========================================================");

        Animal animal1 = new Dog("Grizzy",4,'M');
        animal1.sleep();
        animal1.eat();

        System.out.println(animal1.age);
        System.out.println(animal1.gender);

        System.out.println(animal1);




    }

}
