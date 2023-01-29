package Office_Hours.Practice_09_23_2020;

public class ShapeObjects {

    public static void main(String[] args) {

          Square square1 = new Square(10);

        System.out.println(square1.calculatearea());
        System.out.println(square1.area);
        System.out.println(square1.perimeter);
        System.out.println(square1.calculateperimeter());

        System.out.println(square1);

        Cube cube1 = new Cube(5);

        System.out.println(cube1);

        Circle circle1 = new Circle(10);

        System.out.println(circle1);








    }
}
