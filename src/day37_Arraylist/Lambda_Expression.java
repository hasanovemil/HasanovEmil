package day37_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,3,3,4,4,5,6,7,8,9));

        Predicate<Integer> lessthan5 = p -> p < 5;
        list.removeIf(lessthan5);
        System.out.println(list);
        System.out.println("==========================================");

        Predicate<Integer> oddNumbers = p -> p % 2 !=0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i =0;i <= 100;i++){
            numbers.add(i);
        }
       // numbers.removeIf(oddNumbers);
        numbers.removeIf(p->p%2==0);
        System.out.println(numbers);
        System.out.println("===========================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Emil","Rashad","Gunel","Aida","Rustam","Rasim","Hasan"));

        names.removeIf(each -> each.startsWith("R") &&  each.endsWith("m") );
        System.out.println(names);
        System.out.println("========================================");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,2,2,3,3,4,4,5,6));

        nums.removeIf(p -> Collections.frequency(nums,p) !=1);
        System.out.println(nums);
        System.out.println("===========================================");


    }
}
