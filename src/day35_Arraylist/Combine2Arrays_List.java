package day35_Arraylist;

import java.util.ArrayList;

public class Combine2Arrays_List {

    public static void main(String[] args) {
        String[] group1 = {"Emil","Rashad","Gunel","Aida"};
        String[] group2 = {"Rustam","Xalid","Yaqub","Rasim"};

        ArrayList<String> studentlist = new ArrayList<>();
        for(String each : group1){
            studentlist.add(each);
        }
        for(String each : group2){
            studentlist.add(each);
        }
        System.out.println(studentlist);
    }
}
