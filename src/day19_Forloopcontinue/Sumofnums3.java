package day19_Forloopcontinue;

public class Sumofnums3 {

    public static void main(String[] args) {
        int sum = 0;
        for( int i =0;i <= 30;i++){
            if(i == 10){
                break;
            }
           sum +=i;

        }

        System.out.println(sum);
    }
}
