package day17_Stringreview;

public class practice13 {

    public static void main(String[] args) {

        String str5= "JAVA";
        str5 = str5.toLowerCase();
        String str6 = "Hasanov";
        char ch1 = str6.charAt(1);

        System.out.println(str5);
        System.out.println(ch1);

        String str7 = "I like Python language";
        System.out.println(str7.substring(7,12+1));

        String s8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";
        int num = s8.indexOf("W");
        int num2 = s8.indexOf("We");

        System.out.println(num);
        System.out.println(num2);

        String s9 = "I like Java, Java is a programming language";
        s9 = s9.replace("Java","Python").substring(0,5).toUpperCase();
        System.out.println(s9);

        String s10 = "I like Java,Java is a favorite language";
        System.out.println(s10.replaceFirst("Java","python"));


    }
}
