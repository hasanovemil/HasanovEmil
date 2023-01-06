package day10_Ifstatements;
/*Write a C program to input angles of a triangle and
 check whether triangle is valid or not.*/

public class Triangle {
    public static void main(String[] args) {
        int angle1 = 30;
        int angle2 = 60;
        int angle3 = 90;
        String result = "";

        if(angle1 + angle2 + angle3 == 180){
            result = "Triangle";
        }else{
            result = "Not triangle";
        }
        System.out.println(result);


    }




}
