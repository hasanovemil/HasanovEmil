package day19_Forloopcontinue;

public class Practice_task_OddEven_01 {

    public static void main(String[] args) {
        for(int i = 1;i<=99;i+=2){
            if(i % 5 ==0 && i % 3 ==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("==============================================");

        for( int i =0;i <=100;i++){
            if(i % 2 !=0)
            if(i % 5 ==0 && i % 3 ==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("=============================================");
        for( int i =0;i <=100;i++){
            if(i % 2 ==0){
                if(i % 5 ==0 && i % 3 ==0){
                    System.out.print(i+" ");
                }
            }
        }





    }
}
