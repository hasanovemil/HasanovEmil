package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects2 {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setcatinfo("Cass",11,'F',"Black","Persian");


        Cat[] catPark = {cat1,new Cat(),new Cat(),new Cat(),new Cat(),new Cat()};
        catPark[1].setcatinfo("A",3,'M',"Black","C");
        catPark[2].setcatinfo("B",2,'M',"White","Z");
        catPark[3].setcatinfo("X",5,'F',"Red","K");
        catPark[4].setcatinfo("Y",6,'F',"Green","G");
        catPark[5].setcatinfo("T",8,'M',"Grey","R");

        ArrayList<Cat> femalecats = new ArrayList<>();
        femalecats.addAll(Arrays.asList(catPark));
        femalecats.removeIf(p -> p.gender=='M');

        ArrayList<Cat> malecats = new ArrayList<>();
        malecats.addAll(Arrays.asList(catPark));
        malecats.removeIf( x -> x.gender=='F');

        System.out.println(femalecats.size());
        System.out.println(malecats.size());


    }
}
