package Office_Hours.Practice_08_25_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Review {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
           list1.add(10);
           list1.add(20);
           list1.add(30);
           list1.add(40);

        System.out.println("===============================================");

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));

        for(int i =0;i <= list3.size()-1;i++){
            Integer each = list3.get(i);
            if(each % 2 !=0){
                list3.set(i,each*2);
            }else{
                list3.set(i,each*3);
            }
        }
        System.out.print(list3+"");

        System.out.println("=================================================");

        ArrayList<String> countries = new ArrayList<>();
        countries.addAll(Arrays.asList("America","England","Australia","New Zeland","Russia","Canada"));

        countries.removeIf(p -> p.startsWith("A"));

        System.out.println(countries);




    }
}
