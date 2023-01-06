package day16_String;

public class String_Methods2 {

    public static void main(String[] args) {
      String email = "emil-2035@mail.ru";
      email = email.replace("mail","yahoo");
        System.out.println(email);
        String str1 = "Men Hesenov Emil Rasim oglu";
        int r1 = str1.indexOf("v");
        System.out.println(r1);
        String str5 = "I like to learn Java programming language";
        System.out.println(str5.contains("Python"));
        System.out.println(!str5.contains("Python"));
        String s8 = "Emil";
        System.out.println(s8.startsWith("E"));
    }


}
