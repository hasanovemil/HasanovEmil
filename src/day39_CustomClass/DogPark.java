package day39_CustomClass;

public class DogPark {
    public static void main(String[] args) {

      //  Dog dog1 = new Dog();
        Dog [] dogPark = {new Dog(),new Dog(),new Dog(),new Dog(),new Dog()};

        dogPark[0].setDoginfo("A","B","M",6,"White");
        dogPark[1].setDoginfo("C","D","E",2,"Black");
        dogPark[2].setDoginfo("F","S","T",3,"Red");
        dogPark[3].setDoginfo("Q","R","Y",4,"Grey");
        dogPark[4].setDoginfo("H","K","L",5,"Blue");




        for(int i = 0;i <= dogPark.length-1;i++){
            dogPark[i].getDoginfo();
        }

        System.out.println("===========================================");

        for( Dog eachdog: dogPark){
            eachdog.getDoginfo();
        }
    }
}
