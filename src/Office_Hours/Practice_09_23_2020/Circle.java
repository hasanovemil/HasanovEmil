package Office_Hours.Practice_09_23_2020;

public class Circle extends Shape {

    public double radius;
    public static double PI;

    static{
        PI = 3.14;
    }

    public Circle(double radius) {
        if(radius <=0){
            throw new RuntimeException("Radius cannot be negative or 0");
        }
        this.radius = radius;
        area = calculatearea();
        perimeter = calculateperimeter();
    }

    @Override
    public double calculatearea() {
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public double calculateperimeter() {
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
