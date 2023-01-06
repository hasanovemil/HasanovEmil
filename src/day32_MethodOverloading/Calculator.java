package day32_MethodOverloading;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = scan.nextDouble();
        System.out.println("Enter operator");
        char operator = scan.next().charAt(0);
        System.out.println("Enter second number");
        double num2 = scan.nextDouble();
        double result = calculator(num1,operator,num2);
        System.out.println("result is "+result);


    }

    public static double calculator(double num1,char oper,double num2){
           double result = (oper=='+')? num1+num2 :(oper=='-')? num1-num2 :(oper=='*')? num1*num2 :(oper=='/')? num1/num2
                   :(oper=='%')?num1%num2 : 0;
           return result;


    }
}
