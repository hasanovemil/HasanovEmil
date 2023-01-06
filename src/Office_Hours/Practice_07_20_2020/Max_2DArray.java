package Office_Hours.Practice_07_20_2020;

public class Max_2DArray {

    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        int max = arr2D[0][0];

        for(int j=0;j <=arr2D[0].length-1;j++){
            int[] eacharray = arr2D[j];
            for(int i =0;i <= eacharray.length-1;i++){
                int eachnum=eacharray[i];
                if(eachnum>max){
                    max = eachnum;
                }
            }
        }
        System.out.println("max number: "+max);


    }

}
