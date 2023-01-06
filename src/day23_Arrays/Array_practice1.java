package day23_Arrays;


public class Array_practice1 {

    public static void main(String[] args) {
       String[] students = {"Emil","Rashad","Gunel"};
       String name1 = students[1];
        System.out.println(name1);

       int[] scores = {85,70,95,90,100};
       String[] names = {"Mike","Adam","Tonny","John","Amy"};
      /*
        System.out.println(names[0]+ ":"+scores[0]);
        System.out.println(names[1]+ ":"+scores[1]);
        System.out.println(names[2]+ ":"+scores[2]);
        System.out.println(names[3]+ ":"+scores[3]);
        System.out.println(names[4]+ ":"+scores[4]);

       */

      for(int i =0;i<= 4;i++){
          System.out.println(names[i]+ ":"+scores[i]);

      }

        System.out.println("====================================================");
        String[] classmates = new String[5];
        classmates[0]="Emil";
        classmates[2]= "Rashad";
        classmates[1]="Gunel";
        classmates[3]="Aida";
        classmates[4]="Rustam";

        for( int i =0;i<=classmates.length-1;i++){
            System.out.println(classmates[i]);
        }


    }
}
