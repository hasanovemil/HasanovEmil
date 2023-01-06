package day14_Recap;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your score: ");
        int score = input.nextInt();
        String result = "";
        if(score>=0 && score<=100){
            if(score>=90 && score<=100){
                result = "Excellent";
            }else if(score>=80 && score<89){
                result = "Great";
            }else if(score>=70 && score<79){
                result = "Good";
            }else if(score>=60 && score<69){
                result = "Passed";
            }else{
                result = "Failed";
            }
        }else{
            result = "Invalid";
        }
        System.out.println(result);




    }







}
