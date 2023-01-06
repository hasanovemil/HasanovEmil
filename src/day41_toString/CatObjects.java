package day41_toString;

import java.util.ArrayList;

public class CatObjects {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setcatinfo("Cass",11,'F',"Black","Persian");

        System.out.println(cat1);
        System.out.println("===============================================");

        Cat[] catPark = {cat1,new Cat(),new Cat(),new Cat(),new Cat(),new Cat()};
        catPark[1].setcatinfo("A",3,'M',"Black","C");
        catPark[2].setcatinfo("B",2,'M',"White","Z");
        catPark[3].setcatinfo("X",5,'F',"Red","K");
        catPark[4].setcatinfo("Y",6,'F',"Green","G");
        catPark[5].setcatinfo("T",8,'M',"Grey","R");



        for(Cat each : catPark){
            System.out.println(each);
        }

        ArrayList<Cat> femalecats = new ArrayList<>();
        ArrayList<Cat> malecats = new ArrayList<>();

       /* for(int i = 0;i <= catPark.length-1;i++){
            if(catPark[i].gender=='M'){
                malecats.add(catPark[i]);
            }else{
                femalecats.add(catPark[i]);
            }
        }
        */

        for ( Cat each : catPark){
            if(each.gender=='M'){
                malecats.add(each);
            }else{
                femalecats.add(each);
            }
        }

        System.out.println(femalecats);
        System.out.println(malecats);




    }
}
