package day62_Maps;

public class GarbageCollectionReview {
    public static void main(String[] args) {

        String str1 = "Hasanov";
        str1 = null;

        System.out.println(str1);

        String s1 = new String("Rashad");
        String s2 = new String("Gunel");

        s1 = s2;

        System.out.println(s1 + " " + s2);





    }
}
