package day62_Maps;

public class String_VS_Builder_VS_Buffer {
    public static void main(String[] args) {

        String str1 = "Cybertek";

        str1.concat("School");

        System.out.println(str1);

        System.out.println("==================================================================");

        String str2 = new String("Cybertek");

        StringBuilder sb1 = new StringBuilder("Cybertek");
        sb1.append(" School ");

        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);

        System.out.println("======================");

        String name = "Level";
        String reversedname = new StringBuilder(name).reverse().toString();
        System.out.println(name.equalsIgnoreCase(reversedname));

        System.out.println("==================");

        String s1 = "Friday";
        StringBuilder s2 = new StringBuilder(s1);

        String s3 = s2.toString();
        StringBuffer t1 = new StringBuffer("aaa");






    }
}
