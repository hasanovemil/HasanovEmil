package day10_Ifstatements;
/*Write a C program to check whether the triangle is
equilateral, isosceles or scalene triangle
 */
public class Triangle2 {
    public static void main(String[] args) {
        int angle1 = 60;
        int angle2 = 60;
        int angle3 = 60;
        String result = "";
        if(angle1 == angle2 && angle2== angle3){
            result = "Triangle is equilateral";
        }else if(angle1 == angle2 || angle2== angle3){
            result = "Triangle is isosceles";
        }else {
            result = "Triangle is scalene";
        }
        System.out.println(result);
    }




}
