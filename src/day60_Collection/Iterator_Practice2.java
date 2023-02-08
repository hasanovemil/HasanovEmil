package day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterator_Practice2 {
    public static void main(String[] args) {

        String[] arr2 = {"Emil","Rashad","Gunel","Namiq","Rafiq","Feynman","Dirac","Gunel","Gunel"};

        ArrayList<String> names = new ArrayList<>(Arrays.asList(arr2));

        Iterator<String> it = names.iterator();

        while ((it.hasNext())){
           if( it.next().equals("Gunel") ){
               it.remove();
           }
        }
        System.out.println(names);

        System.out.println("==========================================");

        String[] arr3 = {"Emil","Rashad","Gunel","Namiq","Rafiq","Feynman","Dirac","Gunel","Gunel"};

        ArrayList<String> nameslist = new ArrayList<>(Arrays.asList(arr3));

        nameslist.removeIf( p -> p.equals("Gunel"));

        System.out.println(nameslist);












    }
}
