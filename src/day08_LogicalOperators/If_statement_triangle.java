package day08_LogicalOperators;

public class If_statement_triangle {
    public static void main(String[] args) {
        double angle1 = 100;
        double angle2 = 60;
        double angle3 = 20;
        boolean valid = angle1 + angle2 + angle3 == 200;
        boolean invalid = !valid;
        if (valid) {
            System.out.println("Valid triangle");
        }
        if (invalid) {
            System.out.println("Invalid triangle");
        }


    }
    }
