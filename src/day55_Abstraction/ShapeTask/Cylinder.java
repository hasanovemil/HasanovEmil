package day55_Abstraction.ShapeTask;

public final class Cylinder extends Shape {

    public double radius;
    public double height;

    public Cylinder(double radius, double height) {
        if(radius <= 0 || height <= 0){
            throw new RuntimeException("Radius or height cannot be negative or zero");
        }

        this.radius = radius;
        this.height = height;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius,2));
    }

    @Override
    public double calculatePerimeter() {
        return (2*Math.PI*Math.pow(radius,2))+(2*Math.PI*radius*height);
    }

    @Override
    public double calculateVolume() {
        return Math.PI*Math.pow(radius,2)*height;
    }

    static{
        name = "Cylinder";
        hasVolume = true;

    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
