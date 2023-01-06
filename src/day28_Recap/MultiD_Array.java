package day28_Recap;

public class MultiD_Array {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int[][] arr2d = {{1,2,3,4},{4,5,6,7,8},{9,10,11,12,13}};

        for(int i =0;i <= arr2d.length-1;i++){
            int[] eacharray1d = arr2d[i];
            for( int j = 0; j <= eacharray1d.length-1;j++){
                int eachnum = eacharray1d[j];
                if(eachnum % 2 ==0){
                    continue;

                }
                System.out.print(eachnum+" ");

            }
            System.out.println();
        }

        System.out.println("========================================");

        for(int[] each1d : arr2d){
            for(int eachelement : each1d){
                 int n = eachelement;
                System.out.print(n+" ");

            }
        }




    }
}
