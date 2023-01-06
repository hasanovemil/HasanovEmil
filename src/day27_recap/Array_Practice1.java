package day27_recap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {

    public static void main(String[] args) {
        String[] names = {"Emil","Rashad","Gunel"};

        System.out.println(names[1]);

        for(int i =0;i <= names.length-1;i++){
            if(names[i].charAt(0) == 'R'){
                continue;
            }
            System.out.print(names[i]+" ");
        }
        System.out.println();
        System.out.println("===================================================");
        int[] numbers = new int[5];
        numbers[0]=100;
        System.out.println(Arrays.toString(numbers));
        System.out.println("=============================================");
        Scanner scan = new Scanner(System.in);
        System.out.println("How many names do you want to enter: ");

        String[] students = new String[scan.nextInt()];

        for(int i =0;i <=students.length-1;i++){

            System.out.println("Enter a name: ");
            students[i] = scan.next();
        }



        System.out.println(Arrays.toString(students));






    }
}
