package day62_Maps;

import java.time.LocalDate;
import java.util.*;

public class ListofMaps2 {
    public static void main(String[] args) {

        String[] friends = {"Merhaba","Rena","Gulyar","Arzugul","Rukiye"};
        LocalDate[] DOBfriends = {LocalDate.of(1989,1,12),
                                  LocalDate.of(1979,2,23),
                                  LocalDate.of(1969,3,29),
                                  LocalDate.of(1959,4,18),
                                  LocalDate.of(1949,5,15)};

        String[] classmates = {"Kalbinur","Ceren","Liza","Shakzod","Heydar"};
        LocalDate[] DOBclassmates = {LocalDate.of(1993,1,9),
                                     LocalDate.of(1994,2,10),
                                     LocalDate.of(1995,3,11),
                                     LocalDate.of(1996,4,12),
                                      LocalDate.of(1997,5,23)};

        String[] family = {"Marianna","Juanna Carlos","Marissa","Javier","Cristina"};
        LocalDate[] DOBfamily = {LocalDate.of(2001,1,19),
                                 LocalDate.of(2002,2,20),
                                 LocalDate.of(2003,3,21),
                                 LocalDate.of(2004,4,22),
                                 LocalDate.of(2005,5,23)};



        List< Map <String, LocalDate>> list = new ArrayList<>();

        list.addAll(Arrays.asList(
                new LinkedHashMap<>(),
                new LinkedHashMap<>(),
                new LinkedHashMap<>()
                ));

        for(int i = 0; i < friends.length;i++){
            list.get(0).put(friends[i], DOBfriends[i]);
        }

        for(int i = 0; i < classmates.length;i++){
            list.get(1).put(classmates[i], DOBclassmates[i]);
        }

        for(int i = 0; i < family.length;i++){
            list.get(2).put(family[i], DOBfamily[i]);
        }
        System.out.println(list);









    }
}
