package day22_Nestedloop;

public class Occurancesofchar1 {

    public static void main(String[] args) {
        String str = "men hasanov emil rasim oglu 1985-ci ilde baki seherinde anadan olmusam";
        int index1 = str.indexOf("m");
        int index2 = str.lastIndexOf("m");
        System.out.println(index1);
        System.out.println(index2);
        String s = ""+str.substring(index1,index2+1);
        int count =0;

        for(int i =0;i<= str.length()-1;i++){
            char each = str.charAt(i);
            if(s.equals(each)){
                count+=1;
            }
            int sum = 0;
            if(Character.isDigit(each)){
                sum+= Integer.parseInt(""+each);
            }
            System.out.print(count);
            System.out.print(sum);
        }




    }
}
