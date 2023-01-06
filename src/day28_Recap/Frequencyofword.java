package day28_Recap;

public class Frequencyofword {

    public static void main(String[] args) {
        String str = "javajavajavajavajava";
        int count = 0;
        while(str.contains("java")){
            count++;
            str = str.replaceFirst("java","");
         }
        System.out.println(count);




    }
}
