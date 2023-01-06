package Office_Hours.Practice_07_14_2020;

public class Unique {

    public static void main(String[] args) {
        String str = "ABABC";
        String expectedresult = "";
        for(int j =0;j <= str.length()-1;j++){
            char ch = str.charAt(j);
            int count =0;
            for(int i =0; i <=str.length()-1;i++){
                char each = str.charAt(i);
                if(each == ch){
                    count++;
                }
            }
            if(count == 1){
                expectedresult += ch;
            }
        }


        System.out.println(expectedresult);


    }
}
