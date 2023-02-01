package day58_Polymorphism;

import day57_Polymorphism.PhoneTasks.*;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneShop {

    public static void main(String[] args) {

        Phone[] phone = {
                new Iphone("12","6.1",1000),
                new Samsung("S20","7",1100),
                new Iphone("A20","8.1",1200),
                new Samsung("B30","9.1",1300),
                new Iphone("C40","6.6",1400),
                new Samsung("D50","6.9",1500),
                new Iphone("E60","6.15",1600),
                new Huawei("12","8.1",1700),
                new Iphone("12","10.1",1800),
                new Iphone("12","12.1",1900),
                new Iphone("12","14.2",2000),
                new Samsung("S20","15.6",2100),
                new Samsung("S20","16.7",2200),
                new Samsung("S20","17.8",2300),
                new Samsung("S20","19.8",2400)


        };

        ArrayList<Phone> phoneShop = new ArrayList<>(Arrays.asList(phone));
        System.out.println(phoneShop);

        int countIphone = 0;
        int countSamsung = 0;
        int countHuawei = 0;

        /*for(int i = 0; i <= phoneShop.size()-1;i++){
            Phone each = phoneShop.get(i);
            if(each instanceof Iphone){
                countIphone++;
            }else if(each instanceof Samsung){
                countSamsung++;
            }else {
                countHuawei++;
            }
        }

         */

        for(Phone each : phoneShop){
            if(each instanceof Iphone){
                countIphone++;
            } else if(each instanceof Samsung){
                countSamsung++;
            }else {
                countHuawei++;
            }
        }

        System.out.println("Iphone: "+countIphone);
        System.out.println("Samsung: "+countSamsung);
        System.out.println("Huawei: "+countHuawei);






    }


}
