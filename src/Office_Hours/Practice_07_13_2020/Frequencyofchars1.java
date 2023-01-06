package Office_Hours.Practice_07_13_2020;

public class Frequencyofchars1 {

    public static void main(String[] args) {
       String str = "OOPQQ";
       String nonDup="";
       for(int i =0;i <=str.length()-1;i++){
           String s = ""+str.charAt(i);
           if(!nonDup.contains(s)){
               nonDup +=s;
           }
       }
        System.out.println(nonDup);
        String result = "";

        for(int j=0;j<=nonDup.length()-1;j++){
            char ch1 = nonDup.charAt(j);
            int count = 0;
            for(int i=0;i<=str.length()-1;i++){
                char each = str.charAt(i);
                if(each==ch1){
                    count++;
                }
            }
            result += ""+ch1 + count;
        }

        System.out.println(result);



    }
}
