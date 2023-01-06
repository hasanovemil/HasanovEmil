package day28_Recap;

public class Email {

    public static void main(String[] args) {
        String email = "emil-2035@mail.ru";

        String name = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("ma"),email.indexOf("."));

        System.out.println(name);
        System.out.println(domain);










    }
}
