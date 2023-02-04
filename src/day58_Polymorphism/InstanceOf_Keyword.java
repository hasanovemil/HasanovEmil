package day58_Polymorphism;

import day55_Abstraction.ShapeTask.Circle;
import day55_Abstraction.ShapeTask.Cylinder;
import day55_Abstraction.ShapeTask.Shape;
import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Cat;
import day58_Polymorphism.AnimalTask.Dog;

public class InstanceOf_Keyword {

    public static void main(String[] args) {

        Animal animal1 = new Animal(10,'F');
        Animal animal2 = new Dog("Winston",4,'M');
        Animal animal3 = new Cat("Kiko",2,'M');

        boolean r1 = animal3 instanceof Animal;

        System.out.println(r1);

        boolean r2 = animal3 instanceof Cat;

        System.out.println(r2);

        boolean r3 = animal3 instanceof Dog;

        System.out.println(r3);

        boolean r4 = animal2 instanceof Animal;

        System.out.println(r4);

        Shape shape1 = new Circle(3);
        identifyShape(shape1);





    }

    public static void identifyShape(Shape shape){
         if(shape instanceof Circle){
             System.out.println("Shape is circle");
         }else if(shape instanceof Cylinder){
             System.out.println("Shape is cylinder");
         }else{
             System.out.println("Shape is rectangle");
         }
    }

    public static boolean equalShapes(Shape shape1,Shape shape2){
         boolean result = false;
         boolean bothCircle = shape1 instanceof Circle && shape2 instanceof Circle;
         if(bothCircle){

         }



         return result;
    }








}
