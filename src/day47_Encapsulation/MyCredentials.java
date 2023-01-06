package day47_Encapsulation;

public class MyCredentials {

    public static void main(String[] args) {

        Credentials obj = new Credentials("Emil",25);

        obj.setusername("Emil");
        obj.setPassword("Rashad123");


        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());
        System.out.println(obj.companyName);


    }
}
