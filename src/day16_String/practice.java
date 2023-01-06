package day16_String;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you employeed? : ");
        String answer = scan.next();
        if(answer.equals("Yes")){
            System.out.println("Employeed");
        }else{
            System.out.println("Not employeed");
        }


    }
}
