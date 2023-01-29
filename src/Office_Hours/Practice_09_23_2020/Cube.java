package Office_Hours.Practice_09_23_2020;

public class Cube extends Shape implements Volume  {

    public double side,volume;



    @Override
    public double calculatearea() {
        return Math.pow(side,2)*6;
    }

    @Override
    public double calculateperimeter() {
        return side *4*6;
    }

    @Override
    public double calculatevolume() {
        return Math.pow(side,3);
    }
}
