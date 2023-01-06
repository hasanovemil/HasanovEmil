package day19_Forloopcontinue;

public class Practice_task_Sum_Oddeven_02 {
    public static void main(String[] args) {
        int sum = 0;
        for( int i =0;i<=100;i++){
                if(i % 2 ==0)
                    if(i % 5 ==0 && i % 3 ==0)
                sum += i;}
        System.out.println(sum);
        System.out.println();

        int sumofodd = 0;
        for(int i =0;i<=99;i++){
            if(i % 2 !=0)
            sumofodd+=i;
        }
        System.out.println(sumofodd);





    }






}
