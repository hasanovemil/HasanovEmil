package day29_CustomMethods;

public class Method_Practice {
    public static void main(String[] args) {
        oddnumbers();
        System.out.println("Hello");
        oddnumbers();
        System.out.println("Hello");

        evennumbers();

    }

    public static void oddnumbers(){
        for(int i=1;i <=100;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void evennumbers(){
        for(int i=0;i <=100;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
