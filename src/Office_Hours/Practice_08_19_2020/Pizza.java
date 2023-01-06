package Office_Hours.Practice_08_19_2020;

public class Pizza {
    String size;
    int numofCheeseTopping;
    int numofPepperoniTopping;

    public void setPizzaInfo(String size,int numofCheeseTopping,int numofPepperoniTopping  ){
        this.size = size;
        this.numofCheeseTopping = numofCheeseTopping;
        this.numofPepperoniTopping = numofPepperoniTopping;
    }
    public double calcPrice(){
        int totalnumberofTopping = numofCheeseTopping+numofPepperoniTopping;
        double totalpriceofTopping = totalnumberofTopping * 2;
        double totalPrice = totalpriceofTopping;
        if(size.equalsIgnoreCase("small")){
            totalPrice += 10;
        }else if(size.equalsIgnoreCase("medium")){
            totalPrice += 12;
        }else{
            totalPrice += 14;
        }
        return totalPrice;
    }

    public String toString(){
        return "Size: "+size+"\nNumber of Cheese Topping: "+numofCheeseTopping
                       +"\nNumber of Pepperoni Topping: "+numofPepperoniTopping
                       +"\nTotalprice: "+ calcPrice();
    }




}
