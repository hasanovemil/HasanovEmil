package day17_Stringreview;

public class Practice {
    public static void main(String[] args) {
        String str = "Emil Hesenov";
                //    0123
        //str = str.replace("eMil","Emil");
        System.out.println(str);
        str= str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
                //  e --> E+                            Mil--->mil
        System.out.println(str);
        boolean r= str.contains("Hesen");
        System.out.println(r);
        if (r){
            System.out.println("Emil yaxsi oglandir");}
        else{
            System.out.println("Emil apteke getmelidi");}

        String str1= "baku azerbaycanin paytaxtidir, ancaq azerbaycan azerbaycanin paytaxti deyil";
        System.out.println(str1);
        str1 = str1.replaceFirst("b","B");
        str1 = str1.replace("u az","u Az");
        System.out.println(str1);
        str1 = str1.replace("azerbaycan","gence");
        System.out.println(str1);

        // azerbaycan gence ile evez ele

}}
