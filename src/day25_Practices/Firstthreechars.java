package day25_Practices;

public class Firstthreechars {

    public static void main(String[] args) {
        String[] words = {"apple","banana","strawberry","Java","Python"};
        /*
        System.out.println(words[0].substring(0,3));
        System.out.println(words[1].substring(0,3));
        System.out.println(words[2].substring(0,3));
        System.out.println(words[3].substring(0,3));
        System.out.println(words[4].substring(0,3));

         */
       for( int i =0;i <= words.length-1;i++){
           System.out.println(words[i].substring(0,3));
       }





    }
}
