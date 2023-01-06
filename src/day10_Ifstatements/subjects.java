package day10_Ifstatements;

public class subjects {
    public static void main(String[] args) {
        int percentage = 95;
        String result = "";
        if(percentage >90 && percentage < 100){
            result = "physics";
        }else if(percentage >80 && percentage < 90){
            result = "Chemistry";
        }else if(percentage >70 && percentage < 80){
            result = "biology";
        }else if(percentage >60 && percentage < 70){
            result = "math";
        }else{
            result = "Computer science";
        }
        System.out.println(result);





    }








}
