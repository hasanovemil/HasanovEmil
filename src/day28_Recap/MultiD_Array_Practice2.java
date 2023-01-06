package day28_Recap;

public class MultiD_Array_Practice2 {

    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};

        for(int i = arr2D.length-1;i >=0;i--){
            int[] eachnumber = arr2D[i];
            for(int j = eachnumber.length-1;j >=0;j--){
                int each = eachnumber[j];
                System.out.print(each+" ");
            }
            System.out.println();
        }







    }
}
