package day47_Encapsulation;

public class Test {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);

        AccessModifiers.publicmethod();

        //System.out.println(AccessModifiers.defaultvariable());

        // System.out.println(AccessModifiers.privatevariable);
       //  AccessModifiers.privatemethod();

        Encapsulation obj1 = new Encapsulation();
       // System.out.println(obj1.ssn);

        System.out.println(obj1.getSsn());






    }
}
