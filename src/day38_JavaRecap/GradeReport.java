package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,73,35,47,60,87,77,67,57,47,93,83,73,63,53,43));

        System.out.println(list);
        ArrayList<Integer> gradeofA = new ArrayList<>();
        gradeofA.addAll(list);
        gradeofA.removeIf(each -> each < 90);
        System.out.println("GradeofA " + gradeofA);

        ArrayList<Integer> gradeofB = new ArrayList<>();
        gradeofB.addAll(list);
        gradeofB.removeIf(each -> each < 80 || each > 89);
        System.out.println("GradeofB " + gradeofB);

        ArrayList<Integer> gradeofC = new ArrayList<>();
        gradeofC.addAll(list);
        gradeofC.removeIf(each -> each < 70 || each > 79);
        System.out.println("GradeofC " + gradeofC);

        ArrayList<Integer> gradeofD = new ArrayList<>();
        gradeofD.addAll(list);
        gradeofD.removeIf(each -> each < 60 || each > 69);
        System.out.println("GradeofD " + gradeofD);

        ArrayList<Integer> gradeofF = new ArrayList<>();
        gradeofF.addAll(list);
        gradeofF.removeAll(gradeofA );
        gradeofF.removeAll(gradeofB );
        gradeofF.removeAll(gradeofC );
        gradeofF.removeAll(gradeofD );
        System.out.println("GradeofF " + gradeofF);
        System.out.println("===========================================");

        System.out.println(gradeofA.size()+ " student made A");
        System.out.println(gradeofB.size()+ " student made B");
        System.out.println(gradeofC.size()+ " student made C");
        System.out.println(gradeofD.size()+ " student made D");
        System.out.println(gradeofF.size()+ " student failed");






    }
}
