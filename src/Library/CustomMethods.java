package Library;

public class CustomMethods {

    public static void removedup(String str){
        String nonDup = "";
        for(String each:str.split("")){
            if(!nonDup.contains(each)){
                nonDup += each;
            }
        }
        System.out.println(nonDup);
    }

    public static void reverse(String str){

        String result = "";
        for(int i = str.length()-1;i >= 0;i--){
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}
