package day19_Forloopcontinue;

public class Sumofnum1 {

    public static void main(String[] args) {
        int sum = 0;
        for(int i =0;i<= 20;i++){
            if(i % 5==0){
                sum +=i;
            }
        }
        System.out.println(sum);

    }
}
