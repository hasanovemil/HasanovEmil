package day26_MultidimensionalArray;

import java.util.Arrays;

public class MultiDArray_Practice1 {

    public static void main(String[] args) {
        /*
        Testers: {"Lilia","Cristina","Odina","Elkem"}
        Developers: {"Emil","Rashad","Gunel","Sarah"}
        SM: {"Nurmamed"}
        PO: {"Rustam"}
        BA: {"Alex"}
        scrumteam: testers,developers,sm,po,ba

         */

        String [] testers = {"Lilia","Cristina","Odina","Elkem"};
        String [] developers = {"Emil","Rashad","Gunel","Sarah"};
        String [] SM = {"Nurmamed"};
        String [] PO = {"Rustam"};
        String [] BA = {"Alex"};

        String[][] scrumteam = {testers,developers,SM,PO,BA};

        scrumteam[4][0]="Adam";
        System.out.println(Arrays.deepToString(scrumteam));
        System.out.println("================================================");
        int[][] scores = { {10,20,30,45},{60,55,75,105},{93,48,125,135}};
        for(int[] each1DArray:scores){
            for(int eachelement:each1DArray){
                if(eachelement % 3 ==0 || eachelement % 5 ==0){
                    System.out.print(eachelement+" ");

                }
            }

        }





    }
}
