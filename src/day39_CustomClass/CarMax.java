package day39_CustomClass;

public class CarMax {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.Setinfo("Lexus","RX350",2019,"White",14000,45000);
        car2.Setinfo("Lexus","RX450",2020,"Black",1000,50000);
        car3.Setinfo("Bugatti","Veyron",2018,"Blue",23000,50000);
        car4.Setinfo("Ford","Escape",2018,"White",25000,20000);
        car5.Setinfo("Nissan","GT-R",2015,"Blue",54123,89650);

         car1.Getcarinfo();
         car2.Getcarinfo();
         car3.Getcarinfo();
         car4.Getcarinfo();
         car5.Getcarinfo();

         car3.start();







    }
}
