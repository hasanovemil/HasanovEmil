package Office_Hours.Practice_07_07_2020;

public class Stringreverse {

    public static void main(String[] args) {
        String str = "Batch20";
        String result = "";

        for(int i = str.length()-1;i >=0;i--){
            result += ""+str.charAt(i);
        }
        System.out.println(result);

        System.out.println("==============================================");

        String result2 = "";
        int index = str.length()-1;
        while(index >= 0){
        result2 += str.charAt(index);
        index--;
        }
        System.out.println(result2);

    }
}
