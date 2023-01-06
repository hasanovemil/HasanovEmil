package day29_CustomMethods;

public class Removeduplicates {
    public static void main(String[] args) {
        String str = "ababababcccddee";
                removedup(str);
    }

    public static void removedup(String str){
           String nonDup = "";
           for(String each:str.split("")){
               if(!nonDup.contains(each)){
                   nonDup += each;
               }
           }
        System.out.println(nonDup);
    }
}
