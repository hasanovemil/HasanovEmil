package day48_Inheritance.AnimalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Winston","Medium",3,'M',"German");
        Dog dog2 = new Dog("Charlie","Large",4,'M',"Bulldog");
        System.out.println(dog1.name);
        System.out.println(dog1.size);

        dog1.bark();
        dog1.sleep();
        dog1.eat();

        System.out.println(dog1.age);
        System.out.println(dog1.gender);

        System.out.println(dog1);
        System.out.println(dog2);

        Cat cat1 = new Cat("Felix","Medium",4,'M',"British");


        System.out.println(cat1);
    }
}
