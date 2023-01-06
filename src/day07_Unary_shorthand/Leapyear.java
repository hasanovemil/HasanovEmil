package day07_Unary_shorthand;

public class Leapyear {

    public static void main(String[] args) {
        int year = 2021;
        boolean result = year % 4 != 0;
        System.out.println("2021 is leap year: " +result);

        int number = 1000;
                boolean divisibleby2 = number%2 ==0;
                boolean divisibleby3 = number%3 ==0;
                boolean divisibleby5 = number%5 ==0;

        System.out.println(number+ " is evenly divisibleby2: " + divisibleby2);
        System.out.println(number+ " is evenly divisibleby3: " + divisibleby3);
        System.out.println(number+ " is evenly divisibleby5: " + divisibleby5);



    }





}
