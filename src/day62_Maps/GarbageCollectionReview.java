package day62_Maps;

import day55_Abstraction.ShapeTask.Circle;
import day55_Abstraction.ShapeTask.Rectangle;

public class GarbageCollectionReview {
    public static void main(String[] args) {

        String str1 = "Hasanov";
        str1 = null;

        System.out.println(str1);

        String s1 = new String("Rashad");
        String s2 = new String("Gunel");

        s1 = s2;

        System.out.println(s1 + " " + s2);

        Circle c1 = new Circle(3);
        c1 = null;

        System.out.println(c1);

        Rectangle r1 = new Rectangle(10,20);
        Rectangle r2 = new Rectangle(2,5);

         r1 = r2;
        System.out.println(r1);
        System.out.println(r2);

        System.out.println("==============================================");

        String a1 = "Cybertek";
        a1 = null;

        System.out.println(a1);

        String a2 = "MIT";
        String a3 = "Harvard";
        a2 = a3;

        System.out.println(a2);
        System.out.println(a3);

        System.out.println("=============================================");










    }
}
