//TestingMethods class//

public class TestingMethods {

    // Method to catgorize age group of input using if statmnt//

    public void ifstatementage(int age) {

        if (age >= 18) {
            System.out.println("You are a young adult");
        } else if (age > 45) {
            System.out.println("You are an old adult");

        } else {
            System.out.println("You are a child");
        }
    }

    // Method for day of the Week//

    public String dayoftheWeek(int daynumber) {
        switch (daynumber) {
            case 1:
                return "Monday";

            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Sunday";

        }
    }

    public static void main(String[] args) {
        TestingMethods dynamicMeth = new TestingMethods();
        String day = dynamicMeth.dayoftheWeek(3);
        System.out.println("Today is : " + day);

        dynamicMeth.ifstatementage(12);
    }

}