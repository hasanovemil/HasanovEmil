package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects2 {
    public static void main(String[] args) {
        Carpet[] carpets = {new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};

        carpets[0].customorder(4.5,3.5,7.5,false);
        carpets[1].customorder(5.5,3.5,7.5,true);
        carpets[2].customorder(4.5,5.5,7.5,false);
        carpets[3].customorder(9.5,8.5,6.5,false);
        carpets[4].customorder(1.5,2.5,3.5,false);

        ArrayList<Carpet> persiancarpets = new ArrayList<>();
        persiancarpets.addAll(Arrays.asList(carpets));
        persiancarpets.removeIf(p -> ! p.isPersian);
        ArrayList<Carpet> regularcarpets = new ArrayList<>();
        regularcarpets.addAll(Arrays.asList(carpets));
        regularcarpets.removeIf(p -> p.isPersian);

        System.out.println(persiancarpets.size());
        System.out.println(regularcarpets.size());


    }
}
