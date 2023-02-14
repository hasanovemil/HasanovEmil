package day62_Maps;

import java.time.LocalDate;
import java.util.*;

public class ListofMaps2 {
    public static void main(String[] args) {

        String[] friends = {};
        LocalDate[] DOBfriends = {};

        String[] classmates = {};
        LocalDate[] DOBclassmates = {};

        String[] family = {};
        LocalDate[] DOBfamily = {};



        List< Map <String, LocalDate>> list = new ArrayList<>();

        list.addAll(Arrays.asList(
                new LinkedHashMap<>(),
                new LinkedHashMap<>(),
                new LinkedHashMap<>()
                ));

        System.out.println(list);









    }
}
