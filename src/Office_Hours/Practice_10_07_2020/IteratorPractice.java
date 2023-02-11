package Office_Hours.Practice_10_07_2020;

import java.util.*;

public class IteratorPractice {

    public static void main(String[] args) {

        Set<Integer> s1 = new LinkedHashSet<>();
        s1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Iterator<Integer> it = s1.iterator();

        while (it.hasNext()){
           Integer each = it.next();
           if(each < 5){
               it.remove();
           }
        }

        System.out.print(s1);


        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5));

        Iterator<Integer> it2 = list.iterator();

        while (it2.hasNext()){
            if(it2.next() < 7){
                it2.remove();
            }
        }

       /* for(int i = 0; i <= list.size();i++){
          //  list.removeIf(p -> p < 5);
        }
        */

        System.out.println(list);
        System.out.println();
        System.out.println("===========================================");

        String[] names = {"Emil","Rashad","Gunel","Ali","Aqil","Arif"};

        Set<String> registration = new LinkedHashSet<>();
        registration.addAll(Arrays.asList(names));

        System.out.println(registration);

        Iterator<String> it3 = registration.iterator();

        while (it3.hasNext()){
            String each = it3.next();
            if(each.contains("a")){
                it3.remove();
            }
        }
        System.out.println(registration);







    }
}
