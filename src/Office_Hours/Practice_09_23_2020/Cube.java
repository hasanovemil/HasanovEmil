package Office_Hours.Practice_09_23_2020;

public class Cube extends Shape implements Volume  {

    public double side;

    public Cube(double side) {
        if(side<=0){
            throw new RuntimeException("Cube side cannot be negative or 0");
        }
        this.side = side;
        area = calculatearea();
        perimeter = calculateperimeter();
        volume = calculatevolume();
    }

    @Override
    public double calculatearea() {
        return Math.pow(side,2)*6;
    }

    @Override
    public double calculateperimeter() {
        return side*12;
    }

    @Override
    public double calculatevolume() {
        return Math.pow(side,3);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
