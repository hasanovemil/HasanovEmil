package day62_Maps;

public class Test {
    public static void main(String[] args) {

      //  String favoritecolor = "Blue";

        Color favoritecolor = Color.Blue;

        System.out.println(favoritecolor);

        Browser browsername = Browser.chrome;

        switch (browsername){
            case chrome:
                System.out.println("Chrome browser is set");
                break;

            case firefox:
                System.out.println("Firefox browser is set");
                break;

            case safari:
                System.out.println("Safari browser is set");
                break;

            case edge:
                System.out.println("Edge browser is set");
                break;







        }

        System.out.println("=========================================");

        Day day = Day.Mon;
        Day day2 = Day.Tue;
        Day day3 = Day.Thu;

        Month month1 = Month.Jan;

        Level level1 = Level.Low;

        Planet planet1 = Planet.Earth;









    }
}
