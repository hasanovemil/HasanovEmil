package Office_Hours.Practice_07_15_2020;

public class Frequencyofwords2 {

    public static void main(String[] args) {
        String str = "JavajavaJavajavaJAVA";
        str = str.toLowerCase();
        int count = 0;
        while(str.contains("java")){
            count++;
            str = str.replaceFirst("java","");
        }

        System.out.println(count);

    }
}
