package day42_static;

public class StaticMethods {

    int a = 200;
    static int b = 400;

    public static void main(String[] args) {
        System.out.println(b);
        StaticMethods obj = new StaticMethods();
        System.out.println(obj.a);
    }
    public static void staticmethod(){

    }
    public void instancemethod(){

    }
}
