package Office_Hours.Practice_07_20_2020;

public class Max_3DArray {

    public static void main(String[] args) {
        int[][][] arr3d = {  {{1,2},{3,4}} , {{5,6,7},{8,9,10}} };

        int max = arr3d[0][0][0];
        for(int[][] each2d:arr3d){
            for(int[] each1d:each2d){
                for(int eachelement:each1d){
                    if(eachelement>max){
                        max = eachelement;
                    }
                }
            }
        }

        System.out.println(max);


    }
}
