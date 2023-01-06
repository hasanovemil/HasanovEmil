package Office_Hours.Practice_07_14_2020;

public class Uniquewords {

    public static void main(String[] args) {
        String[] words = {"Emil","Rashad","Rashad","Gunel","Gunel","Aida"};
        for(String b : words){
            String s = b;
            int count = 0;

            for(String each : words){
                if(each.equals(s)){
                    count++;
                }
            }
            if(count ==1){
                System.out.println(s);
            }

        }







    }
}
