package day28_Recap;
import java.util.Arrays;
public class ArraysShortQuiz {

    public static void main(String[] args) {
        char[] array = {'D','C','A','B'};
        Arrays.sort(array);

        for(char each:array){
            System.out.print(each+" ");
            if(each == 'D'){
                continue;
            }
        }
        System.out.println();
        System.out.println("========================================");

        int wd = 0;
        String[] days = {"sun","mon","wed","sat"};
        for(int i =0;i < days.length;i++){
            switch (days[i]){
                case "sat":
                case "sun":
                    wd -=1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd +=2;


            }

        }




    }
}
