package day59_OOPReview;


import day55_Abstraction.ShapeTask.Circle;
import day55_Abstraction.ShapeTask.Rectangle;
import day55_Abstraction.ShapeTask.Shape;


public class Polymorphism {
    public static void main(String[] args) {

        Shape shape1 = new Circle(3);

        Shape shape2 = new Rectangle(3,4);




        System.out.println(((Circle)shape1).radius);

        System.out.println(((Rectangle)shape2).length);

        Rectangle r1 = new Rectangle(10,20);

        Shape shape4 = r1;

        System.out.println(r1);










    }
}
