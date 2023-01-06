package day15_String;

public class substring_methods {

    public static void main(String[] args) {
        String sentence = "Emil is a good boy";
        String word1 = sentence.substring(0 , 4);
        System.out.println(word1);
        System.out.println("=================================================");
        String sentence2 = "I like Movies and Tv series";
        String word3 = sentence2.substring(7,13);
        System.out.println(word3);
        System.out.println("==============================================");

        String s = "I like game of thrones";
        String series = s.substring(7 );
        System.out.println(series);
       String s2 = "I like Python programming language";
       String language = s2.substring(7);
        System.out.println(language);


    }


}
