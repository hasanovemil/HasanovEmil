package day55_Abstraction.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

      Circle circle1 = new Circle(2.5);
        System.out.println(circle1);
        System.out.println("Circle has volume: "+circle1.hasVolume);

        Circle circle2 = new Circle(5.5);
        System.out.println(circle2);

        Rectangle rectangle1 = new Rectangle(5,8);

        System.out.println(rectangle1);

        Cylinder cylinder1 = new Cylinder(5,10);
        System.out.println(cylinder1);

       // Circle circle3 = new Circle(-10);

     // System.out.println(circle3);

    //  Rectangle rectangle2 = new Rectangle(-2,0);

     // System.out.println(rectangle2);

      //Cylinder cylinder2 = new Cylinder(0,0);

     // System.out.println(cylinder2);



    }


}
