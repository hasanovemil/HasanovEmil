package day52_Exceptions;

import java.time.LocalTime;

public class ThrowPractice {

    public static void main(String[] args) {


      String drivername = "Chrome";

      if(drivername.equals("Chrome")){
          System.out.println("set up chrome");
      }else if(drivername.equals("Firefox")){
          System.out.println("set up firefox");
      }else if(drivername.equals("Opera")){
          System.out.println("set up opera");
      }else{
          throw new RuntimeException("Invalid browser name");
      }

        System.out.println("===================================================");

        if(LocalTime.now().getMinute()==45){
            throw new RuntimeException();
        }else{
            System.out.println("Continue");
        }



    }
}
