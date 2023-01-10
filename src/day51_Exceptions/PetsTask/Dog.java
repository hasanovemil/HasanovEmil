package day51_Exceptions.PetsTask;

public class Dog extends Pet   {


       public Dog(String name, int age, char gender, String breed, String color) {
              super(name, age, gender, breed, color);

       }

       @Override
       public String toString() {
              return "Dog{" +
                      "name='" + name + '\'' +
                      ", age=" + age +
                      ", gender=" + gender +
                      ", breed='" + breed + '\'' +
                      ", color='" + color + '\'' +
                      '}';
       }
}


