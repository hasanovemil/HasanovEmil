package day43_Static;

public class static_VS_instance {

    static int staticvariable;
    int instanceVariable;

    public static void main(String[] args) {

        static_VS_instance obj1 = new static_VS_instance();
        obj1.instanceVariable = 100;
        obj1.staticvariable = 500;


        static_VS_instance obj2 = new static_VS_instance();
        obj2.instanceVariable = 200;
        obj2.staticvariable = 400;

        System.out.println(obj1.instanceVariable);
        System.out.println(obj2.instanceVariable);

        System.out.println("======================================================");

        System.out.println(obj1.staticvariable);
        System.out.println(obj2.staticvariable);


    }
}
