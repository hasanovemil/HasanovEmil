package day34_WrapperClasses;
import java.util.ArrayList;

public class List_Intro {

    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
         scores.add(95);
         scores.add(100);
         scores.add(85);
         scores.add(75);
         scores.add(1,65);



        System.out.println(scores);
        System.out.println(scores.get(2));
        System.out.println(scores.size());



    }
}
