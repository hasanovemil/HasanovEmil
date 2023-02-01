package day57_Polymorphism;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("5s","5.3",600);
        Samsung samsung = new Samsung("S20","6.1",800);
        Huawei huawei = new Huawei("Robery","5.3",25);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(huawei);




    }
}
