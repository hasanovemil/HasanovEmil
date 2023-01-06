package day28_Recap;

import java.util.Arrays;

public class MultiD_Array_Practice1 {

    public static void main(String[] args) {
         String[] group33 = {"Emil","Rashad","Gunel","Aida","Rustam","Rasim","Yaqub","Xalid"};
         String[] group22 = {"Samir","Ilham","Camal","Kamil","Sema","Ulker","Behram","Ramil"};
         String[] group2 = {"Ali","Anton","Elif","Filip","Guljannat"};
         String[] group21 = {"Violeta","Alla","Adam","Lilia"};
         String[] group17 = {"Elvira","Zeliha","Paban","Vaqif","Togrul","Araz","Roza","Sedge"};

         String[][] Batch20 = {group33,group22,group2,group21,group17};
         for(int i = 0;i <= Batch20.length-1;i++){
            String[] eachgroup =  Batch20[i];
             //System.out.println(Arrays.toString(eachgroup));
             for(int j =0;j <= eachgroup.length-1;j++){
                 String name = eachgroup[j];
                 if(name.toLowerCase().contains("r")){
                     System.out.print(name+" ");
                 }
             }
             System.out.println();
         }











    }
}
