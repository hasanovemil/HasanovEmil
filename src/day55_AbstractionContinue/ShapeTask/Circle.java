package day55_AbstractionContinue.ShapeTask;

public class Circle extends Shape {

    public double radius;

    @Override
    public double calculateArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    @Override
    public double calculatePerimeter(){
        return radius*2*Math.PI;
    }
    @Override
    public double calculateVolume(){
        return 0;
    }




}
