package Office_Hours.Practice_09_02_2020;


public class Circle {

    public double radius;
    public double diameter;
    public static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
        diameter = radius * 2;
    }
    public double calcArea(){
        return radius*radius*PI;
    }

    public double perimeter(){
        return 2*PI*radius;
    }







}
