package day37_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,5,6,7,8,9));

        list.removeIf(p -> Collections.frequency(list,p) == 1);

        System.out.println(list);
        System.out.println("==============================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Canada","Bob","David","Lan","Abida","Ebrahim","Farida"));

        names.removeIf(p -> p.toLowerCase().charAt(0) == p.charAt(p.length()-1));
        System.out.println(names);
        System.out.println("==========================================================");

        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,73,35,47));

        ArrayList<Integer> gradeofA = new ArrayList<>();
        ArrayList<Integer> gradeofB = new ArrayList<>();
        ArrayList<Integer> gradeofC = new ArrayList<>();
        ArrayList<Integer> gradeofD = new ArrayList<>();
        ArrayList<Integer> gradeofF = new ArrayList<>();





    }
}
