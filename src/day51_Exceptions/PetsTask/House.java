package day51_Exceptions.PetsTask;

public class House {

    public static void main(String[] args) {

         Dog dog1 = new Dog("Winton",4,'M',"Scotty Terrier","White");

        System.out.println(dog1);

        Cat cat1 = new Cat("Welat",1,'M',"British short hair","Black");

        System.out.println(cat1);

        Tiger tiger1 = new Tiger("Zara",12,'M',"Caspian","White");

        System.out.println(tiger1);

        tiger1.eat();

        tiger1.drink();

        tiger1.sleep();





    }
}
