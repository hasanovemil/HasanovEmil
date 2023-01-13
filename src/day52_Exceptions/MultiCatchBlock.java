package day52_Exceptions;

public class MultiCatchBlock {

    public static void main(String[] args) {

        int[] arr = { 10 ,20 };

        try{
            System.out.println(arr[20]);
        }catch(ArithmeticException e){
            System.out.println("Aritmetic exception is handled");
        }catch(ClassCastException e){
            System.out.println("ClassCastException");
        }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array Index Out Of Bounds Exception");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Index out of bounds exception");
        }catch (RuntimeException e){
            System.out.println("Run time Exception");
        }

        System.out.println("===============================================");

        String str = "Hasanov";
        try {
            System.out.println(str.charAt(200));
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("==========================================");

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }
        System.out.println("=========================================");

        try{
            System.out.println(8/0);
            System.out.println("Try Block");
        }catch (ArithmeticException e){
            System.out.println("Catch block");
        }finally {
            System.out.println("Finally block");
        }








        System.out.println("Completed");





    }
}
