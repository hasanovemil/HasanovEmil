package day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {
        String firstname = "EMil";
        String lastname = "Hasanov";
        int age = 21;
        String citizen1 = "Russia";
        String Citizen2 = "USA";
        boolean eligibleage = age>=18;
        boolean usCitizen = citizen1 == "USA" || Citizen2 == "USA";
        boolean eligibletovote = eligibleage && usCitizen;
        String fullname = firstname+ " " + lastname;
        System.out.println(fullname + " eligibletovote:  " +eligibletovote );

    }






}
