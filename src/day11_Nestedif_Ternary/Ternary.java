package day11_Nestedif_Ternary;

public class Ternary {
    public static void main(String[] args) {
      int num = 101;

        String result3 = (num % 2 == 0)? "Even" : "Odd";

        System.out.println(result3);
        System.out.println("===================================================");
        int num1 = 10;
        int num2 = 20;

        int  max2 = (num1 > num2)? num1 : num2;
        System.out.println(max2);
        System.out.println("====================================================");

        int age = 20;
        boolean eligible = false;
        if(age >= 30){
          eligible = true;
        }else{
            eligible = false;
        }
        System.out.println(eligible);
        boolean eligible2 = (age >= 30) ? true : false;
        System.out.println(eligible2);
    }





}
