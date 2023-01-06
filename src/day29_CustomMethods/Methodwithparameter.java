package day29_CustomMethods;

public class Methodwithparameter {
    public static void main(String[] args) {
        printhello(5);
        age(2005,2022);
    }

    public static void printhello(int numbersoftimes){
        for(int i=0;i < numbersoftimes;i++){
            System.out.println("hello world");
        }
    }

    public static void age(int birthyear,int currentyear){
        if(currentyear < birthyear){
            System.out.println("Invalid entry");
        }else{
            int age = currentyear-birthyear;
            System.out.println("You are "+age+" years old");
        }

    }
}
