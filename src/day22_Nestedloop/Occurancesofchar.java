package day22_Nestedloop;

public class Occurancesofchar {

    public static void main(String[] args) {
      String str = "Hasanov Emil yaxsi oglandir";
      char ch = 'a';
      int count = 0;
      for(int i = 0;i <= str.length()-1;i++){
          char each = str.charAt(i);
          if(each == ch){
              count++;
          }
      }

        System.out.println(count);

    }
}
