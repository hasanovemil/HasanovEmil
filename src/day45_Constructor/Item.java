package day45_Constructor;

public class Item {

    String name;
    double unitprice;
    int quantity;

    public Item(String name, double unitprice, int quantity) {
        this.name = name;
        this.unitprice = unitprice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return unitprice*quantity;
    }

    public String toString(){
        return "Name: "+name+",Unit price: "+unitprice+",Quantity: "+quantity+",total Price: "+calcCost();
    }
}
