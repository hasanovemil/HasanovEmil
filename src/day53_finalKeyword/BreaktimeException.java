package day53_finalKeyword;

public class BreaktimeException extends RuntimeException {

          public BreaktimeException(){
              super("it is time for a break");
              System.err.println("Time to take 15 minutes break");
          }
          public BreaktimeException(String str){
              super(str);
              System.err.println("Time to take 15 minutes break");
          }
}

class Test{

    public static void main(String[] args) {

      //throw new RuntimeException("This is runtime Exception");
        throw new BreaktimeException("You need to give us a break");
        // throw new Test();
        // System.out.println("Test Completed");


    }

}
