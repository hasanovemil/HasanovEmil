package Office_Hours.Practice_08_31_2020;

public class Static_VS_Instance {

    int insvariable;
    static int staticvariable;

    public static void main(String[] args) {
        System.out.println(staticvariable);

        Static_VS_Instance obj = new Static_VS_Instance();
        System.out.println(obj.insvariable);

        System.out.println("=================================================");

        Static_VS_Instance obj1 = new Static_VS_Instance();
        obj1.insvariable = 100;
        obj1.staticvariable = 200;

        Static_VS_Instance obj2 = new Static_VS_Instance();
        obj2.insvariable = 300;
        obj2.staticvariable = 400;

        System.out.println(obj1.insvariable);
        System.out.println(obj1.staticvariable);

        System.out.println(obj2.insvariable);
        System.out.println(obj2.staticvariable);

        System.out.println(Static_VS_Instance.staticvariable);

        System.out.println("=================================================");



    }

    public void method1(){
        System.out.println(insvariable);
        System.out.println(staticvariable);
    }

}
