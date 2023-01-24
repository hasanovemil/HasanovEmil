package Office_Hours.Practice_09_16_2020;

public class ExceptionTypes {

    public static void main(String[] args) {

       // System.out.println("Cybertek".charAt(200));

        // Thread.sleep(3000);

        try {
            System.out.println(9 / 0);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception is caught" + e.getMessage());
        }

        System.out.println("Test case 1 completed");


    }
}
