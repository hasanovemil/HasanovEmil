package day08_LogicalOperators;

import java.sql.SQLOutput;

public class If_statement {

    public static void main(String[] args) {
        int a = 3000 ;
        int b = 5000;
        if(a>b){
            System.out.println(a + " is a max number");
        }
        if ( b>a){
            System.out.println(b + " is a max number");
        }
        if(a==b){
            System.out.println("a is equal to b" );
        }
        System.out.println("===========================================");
        boolean breaktime = true;
        if(breaktime == true){
            System.out.println(           "Take 15 min break"

            );        }
        if(breaktime == false){
            System.out.println("Keep studying");
        }




    }








}
