package day55_AbstractionContinue.ShapeTask;

public final class Cylinder extends Shape {

    public double radius;
    public double height;


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
}
