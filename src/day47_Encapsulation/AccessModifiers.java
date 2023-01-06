package day47_Encapsulation;

public class AccessModifiers {

    public static int publicVariable = 100;

    public static void publicmethod(){
        System.out.println("public method");
    }

    static int defaultvariable = 200;
    static void defaultmethod(){
        System.out.println("defaultmethod");
    }




    private static int privatevariable = 300;

    private static void privatemethod(){
        System.out.println("private method");
    }

    public static void main(String[] args) {
        System.out.println(publicVariable);
        System.out.println(defaultvariable);
        System.out.println(privatevariable);

        publicmethod();
        defaultmethod();
        privatemethod();

    }

}
