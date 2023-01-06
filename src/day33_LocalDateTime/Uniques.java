package day33_LocalDateTime;


public class Uniques {

    public static void main(String[] args) {
         int[] arr = {2,2,1,3,3};
        for(int element :arr){
            int count = 0;
            for(int b :arr){
                if(element==b){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }
        }
        System.out.println();

        System.out.println("=================================");
        System.out.println();
        int[] n1 = {10,20,20,30,40,40,50,60,70,70,80,80,90,100,100};
        uniqueElement(n1);
        System.out.println("===========================");
        double[] n2 = {10,20,20,40,50,50};
        uniqueElement(n2);
        System.out.println("===========================");
        String[] n3 = {"A","A","B","C","D","D"};
        uniqueElement(n3);
        System.out.println("===============================");
        char[] n4 = {'A','B','C','C'};
        uniqueElement(n4);
    }

    public static void uniqueElement(int[] arr){
        for(int element :arr){
            int count = 0;
            for(int b :arr){
                if(element==b){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }

    public static void uniqueElement(char[] arr){
        for(char element :arr){
            int count = 0;
            for(char b :arr){
                if(element==b){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }

    public static void uniqueElement(double[] arr){
        for(double element :arr){
            int count = 0;
            for(double b :arr){
                if(element==b){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }

    public static void uniqueElement(String[] arr){
        for(String element :arr){
            int count = 0;
            for(String b :arr){
                if(element.equals(b)){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }


}
