package day58_Polymorphism;

import day55_Abstraction.ShapeTask.Circle;
import day55_Abstraction.ShapeTask.Cylinder;
import day55_Abstraction.ShapeTask.Rectangle;
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

        Circle c1 = new Circle(3);
        Circle c2 = new Circle(5);

        System.out.println(equalShapes(c1,c2));

        Rectangle r8 = new Rectangle(4,5);
        Rectangle r9 = new Rectangle(6,10);

        System.out.println(equalShapes(r8,r9));

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
            Circle c1 = (Circle) shape1;
            Circle c2= (Circle) shape2;
            if(c1.radius == c2.radius){
                result = true;
            }
         }

         boolean bothRectangle = shape1 instanceof Rectangle && shape2 instanceof Rectangle;
         if(bothRectangle){
             Rectangle r1 = (Rectangle) shape1;
             Rectangle r2 = (Rectangle) shape2;
             if(r1.width == r2.width && r1.length == r2.length){
                 result = true;
             }
         }


         return result;
    }








}
