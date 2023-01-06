package day23_Arrays;

public class Frequencyofchars {

    public static void main(String[] args) {
        String str = "ABAB";
        String nonDup = ""; // "AB"

        String result = ""; // A2B2

        for(int i = 0; i <= str.length()-1;i++){
            String ch = ""+str.charAt(i);
            if(!nonDup.contains(ch)){
                 nonDup+=ch;
            }
        }
        System.out.println(nonDup);

        for(int j = 0;j <= nonDup.length()-1;j++){
            char ch = nonDup.charAt(j);
            int count = 0;
            for(int i =0;i <= str.length()-1;i++){
                if(str.charAt(i)==ch){
                    count++;
                }
            }
            System.out.print(""+ch+count);
        }





    }
}
