package day16_String;

public class checkwords3 {
    public static void main(String[] args) {
        String s1 = "emil";
        String s2 = "rasad";
        String s3 = "gunel";
        if(s1.length()==s2.length() && s2.length()==s3.length()){
            System.out.println("All words are same");
        }else if(s1.length()==s2.length() && s2.length()==s3.length() && s1.length()==s3.length()){
            System.out.println("Not same nor different lengts");
        }else{
            System.out.println("All different length");
        }




    }




}
