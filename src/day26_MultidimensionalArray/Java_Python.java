package day26_MultidimensionalArray;
import  java.util.Arrays;
public class Java_Python {

    public static void main(String[] args) {
        String sentence = "I love Java, Python is cool Javascript";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words ));
        int countJava = 0;
        int countPython = 0;

        for(String each : words){
            if(each.contains("Java")){
                countJava++;
            }else if(each.contains("Python")){
                countPython++;
            }
        }
        System.out.println(countJava);
        System.out.println(countPython);


    }
}
