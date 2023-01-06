package day39_CustomClass;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDoginfo("Sivan","Beagle","medium",2,"mix");
        dog2.setDoginfo("Roofus","Argentinian Dog","large",8,"White");
        dog3.setDoginfo("Winston","Scotiies Treier","Small",1,"Black");

        dog1.getDoginfo();
        dog2.getDoginfo();
        dog3.getDoginfo();

        dog1.eat("Kelle Paca");
        dog2.drink("water");
        dog3.sleep();



    }
}
