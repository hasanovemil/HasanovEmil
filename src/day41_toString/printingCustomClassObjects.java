package day41_toString;

public class printingCustomClassObjects {
    public static void main(String[] args) {
          String str = new String("Hasanov");
          System.out.println(str);
          System.out.println(new String("Emil"));

        System.out.println(str.toString());
        System.out.println(new String("Emil").toString());

        System.out.println("================================================");

        Carpet c1 = new Carpet();
        System.out.println(c1);


    }
}
