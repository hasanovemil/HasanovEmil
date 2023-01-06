package day11_Nestedif_Ternary;

public class Nestedif_Practice1 {
    public static void main(String[] args) {
      double salary = 120;
      int jobhistory = 20;
      String result = "";
      if(salary >= 30000){
          if(jobhistory>=5){
              result = "you are qualified";
          }else{
              result = "You must been at least 2 year jobhistory";
          }

      }else{
           result = "you must earn at least 30k salary";
      }
        System.out.println(result);




    }





}
