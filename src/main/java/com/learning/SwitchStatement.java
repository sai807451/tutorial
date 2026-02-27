public class SwitchStatement {
    public static void main(String arg[]) {

        switchPractice1();
        switchPractice2();
//       WeekDays week=WeekDays.TUESDAY;
//       switch(week){
//            case SUNDAY:
//                System.out.println("this is my fav day of week");
//                break;
//           case MONDAY:
//               System.out.println("this is my least fav day of week");
//               break;
//           case TUESDAY:
//               System.out.println("this is NOT my fav day ");
//               break;
//           default:
//               System.out.println("holidays are my fav day ");
//               break;
        }

    }

    private static void switchPractice2() {
        String h = "java";    //
        switch (h) {
            case "python":
                System.out.println(1);
                break;
            case "javascript":
                System.out.println(2);
                break;
            default:
                System.out.println("me finally");
                break;
            case "java":
                System.out.println(3);
                break;
            case "learning":
                System.out.println(4);
                break;

        }


    }

    private static void switchPractice1() {
        int f = 8;
        switch (++f) {

            case 9:
                System.out.println("ria ranked top of my class " + 1);
                break;
            case 2:
                System.out.println("chotu ranked top of my class " + 2);
                break;
            case 3:
                System.out.println("ria ranked top of my class " + 3);
                break;
            case 4:
                System.out.println("ria ranked top of my class " + 4);
                break;
            default:
                System.out.println("passed exam percnetage" + 100);
        }
    }

void main() {
}


/*public class Geeks {

   // Nested Switch Case Statement
    public static void main(String[] args)
    {
        // Custom input string
        String Branch = "CSE";
        int year = 2;

        // Switch case
        switch (year) {

        // Case
        case 1:
            System.out.println(
                "elective courses : Advance english, Algebra");

            // Break statement to hault execution here
            // itself if case is matched
            break;

            // Case
        case 2:

            // Switch inside a switch
            // Nested Switch
            switch (Branch) {

            // Nested case
            case "CSE":
            case "CCE":
                System.out.println(
                    "elective courses : Machine Learning, Big Data");
                break;

            // Case
            case "ECE":
                System.out.println(
                    "elective courses : Antenna Engineering");
                break;

                // default case
                // It will execute if above cases does not
                // execute
            default:

                // Print statement
                System.out.println(
                    "Elective courses : Optimization");
            }
        }
    }
}*/


