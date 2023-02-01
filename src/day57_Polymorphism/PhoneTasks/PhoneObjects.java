package day57_Polymorphism.PhoneTasks;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("5s","5.3",600);
        Samsung samsung = new Samsung("S20","6.1",800);
        Huawei huawei = new Huawei("Robery","5.3",25);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(huawei);

        Phone phone1 = new Iphone("11","6.4",700);
        Phone phone2 = new Samsung("A53","7.5",900);
        Phone phone3 = new Huawei("S8","8.2",500);

        Phone [] phones = {iphone,samsung,huawei};




    }
}
