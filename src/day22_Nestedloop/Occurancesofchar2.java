package day22_Nestedloop;

public class Occurancesofchar2 {

    public static void main(String[] args) {
        String str = "men hasanov emil rasim oglu 1985-ci ilde baki seherinde anadan olmusam";
        int index1 = str.indexOf("m");
        int index2 = str.lastIndexOf("m");
        System.out.println(index1);
        System.out.println(index2);
        String s = str.substring(index1,index2+1);
        int count =0;
        for(int i =index1;i<= index2;i++){
            String s2 = ""+str.charAt(i);
            if(s2.equals(s)){
                count++;
            }
        }
        System.out.println(count);

    }
}
