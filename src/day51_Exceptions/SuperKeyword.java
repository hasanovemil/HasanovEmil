package day51_Exceptions;

class Test{
    int a;
}

public class SuperKeyword extends Test{

    public void print1(){
        System.out.println(a);
    }
    public void print2(){
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.a = 200;

        SuperKeyword obj2 = new SuperKeyword();
        obj2.a = 300;

        obj2.print1();
        obj2.print2();
    }

}
