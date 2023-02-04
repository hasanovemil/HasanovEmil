package day58_Polymorphism;


import day57_Polymorphism.PhoneTasks.Huawei;
import day57_Polymorphism.PhoneTasks.Iphone;
import day57_Polymorphism.PhoneTasks.Phone;
import day57_Polymorphism.PhoneTasks.Samsung;

public class DownCasting_Practice {

    public static void main(String[] args) {

        Phone phone1 = new Iphone("11","5",1000);
        Iphone iphone = (Iphone) phone1;

        System.out.println(phone1);
        System.out.println(iphone);


       // phone1.faceTiming(123456);
        iphone.faceTiming(123456);

        ((Iphone) phone1).faceTiming(123);

        System.out.println("=============================================");

        Phone phone2 = new Samsung("S20","8.5",800);

        ((Samsung)phone2).freezing();

        Phone phone3 = new Huawei("FG","8.2",500);

        ((Huawei) phone3).stealInfo();






    }
}
