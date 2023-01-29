package Office_Hours.Practice_09_23_2020;

public class Square extends Shape {

    public double side;

    public Square(double side) {
        if(side <=0 ){
            throw new RuntimeException("side of square cannot be negative or zero");
        }
        this.side = side;
        area = calculatearea();
        perimeter = calculateperimeter();
    }

    @Override
    public double calculatearea(){
         return Math.pow(side,2);
    }

    @Override
    public double calculateperimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
