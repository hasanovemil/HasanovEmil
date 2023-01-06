package day29_CustomMethods;

public class Eligiblity {


    public static void eligibletobuyalcohol(boolean hasID, int age){
        if(hasID && age >= 21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are eligible to buy milk");
        }
    }

    public static void main(String[] args) {
        vote("Emil",28,true,"Biden");
        eligibletobuyalcohol(true,19);
        calculator(100,'*',200);


    }

    public static void vote(String name, int age, boolean citizen, String presidentname){
      boolean eligibletovote = age >= 18 && citizen == true;
      if(eligibletovote){
          System.out.println(name+"eligible to vote" +presidentname);
      }else{
          System.out.println(name+"eligible to vote");
      }
    }

    public static void calculator(double num1,char operator,double num2){
        switch(operator){
            case'+':
                System.out.println("Addition"+(num1+num2));
                break;
            case'-':
                System.out.println("Substraction"+(num1-num2));
                break;
            case'*':
                System.out.println("Multiplication"+(num1*num2));
                break;
            case'/':
                System.out.println("Division"+(num1/num2));
                break;
            case'%':
                System.out.println("Remainder"+(num1%num2));
                break;
            default:
                System.out.println("Invalid operator:");

        }
    }

}
