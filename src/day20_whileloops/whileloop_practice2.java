package day20_whileloops;

public class whileloop_practice2 {

    public static void main(String[] args) {
        int num =10;
        while(num<15){
            System.out.println("Hasanov");
            num++;
        }
        System.out.println();
        System.out.println("==============================================");

        String str = "Hasanov";
        String result = "";
        int index = str.length()-1;
        while(index >= 0){
            result += str.charAt(index);
            index--;
        }

        System.out.println(result);



    }
}
