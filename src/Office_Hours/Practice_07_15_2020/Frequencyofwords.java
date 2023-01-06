package Office_Hours.Practice_07_15_2020;

public class Frequencyofwords {

    public static void main(String[] args) {
        String str = "dogdogdog";
        int count = 0;
        while(str.contains("dog")){
            count++;
            str = str.replaceFirst("dog","");
        }
        // System.out.println(str);


        System.out.println(count);
        System.out.println(str);






    }
}
