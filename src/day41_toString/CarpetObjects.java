package day41_toString;

import java.util.ArrayList;

public class CarpetObjects {
    public static void main(String[] args) {
       Carpet[] carpets = {new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};

       carpets[0].customorder(4.5,3.5,7.5,false);
       carpets[1].customorder(5.5,3.5,7.5,true);
       carpets[2].customorder(4.5,5.5,7.5,false);
       carpets[3].customorder(9.5,8.5,6.5,false);
       carpets[4].customorder(1.5,2.5,3.5,false);

        ArrayList<Carpet> persiancarpets = new ArrayList<>();
        ArrayList<Carpet> regularcarpets = new ArrayList<>();

        /*for(int i =0; i <= carpets.length-1;i++){
           if(carpets[i].isPersian){
               persiancarpets.add(carpets[i]);
           }else{
               regularcarpets.add(carpets[i]);

           }
        }
        */

        for( Carpet each: carpets){
            if(each.isPersian){
               persiancarpets.add(each);
            }else{
                regularcarpets.add(each);
            }
        }

        System.out.println(persiancarpets.size());
        System.out.println(regularcarpets.size());

/*
        for( Carpet each : carpets){
            each.getcarpetinfo();
            */

        }


    }

