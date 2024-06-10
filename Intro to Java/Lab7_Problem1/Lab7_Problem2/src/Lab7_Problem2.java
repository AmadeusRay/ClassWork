import java.util.Scanner;

/*
Arash Vasheghani
CS\IS 112
Lab 7 Problem2
2/02/2024
*/

/*
Methods required
**make conversions string?""
convertKilometers. Takes in meters and returns kilo. Not a void
kilometers = meters .0.001

convertInches takes in meters returns inches. Not a void
inches = meters * 39.37

convertFeet. takes in meters. return feet. Not a void
feet = meters *3.281

showMenu . Void method. No argumentrs. Should display menu
METER CONVERSION
1) Convert to Kilometers
2) Convert to Inches
3) Convert to Feet
4) Quit the Program

Please make a selection:

** don't allow negative numbers for the meters input
** should be continuous until user quits

pseudocode:\


 */

public class Lab7_Problem2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int selection;

        do {
            showMenu();
            System.out.println("\nPlease make a selection:");
            selection = keyboard.nextInt();
            if(selection == 4)
            {
                break;
            }
            conversionSequence(selection);  // to have a cleaner main
        } while (selection != 4);
    }

    public static void showMenu()
    {
        System.out.println("METER CONVERSION");
        System.out.println("1)  Convert to Kilometers");
        System.out.println("2)  Convert to Inches");
        System.out.println("3)  Convert to Feet");
        System.out.println("4)  Quit the Program");
    }

    public static void conversionSequence(int selection)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Number of meters?");
        double meters = keyboard.nextDouble();

        switch (selection) {
            case 1:
                if (meters <= 0) {
                    System.out.println("Must be positive");
                    keyboard.nextLine();
//                    continue;
                }
                System.out.printf("Converted to Kilometers: %.3f%n",convertToKilometers(meters));
                break;
            case 2:
                if (meters <= 0) {
                    System.out.println("Must be positive");
                    keyboard.nextLine();
//                    continue;
                }
                System.out.printf("Converted to Inches: %.3f%n", convertToInches(meters));
                break;
            case 3:
                if (meters <= 0) {
                    System.out.println("Must be positive");
                    keyboard.nextLine();
//                    continue;
                }
                System.out.printf("Converted to Feet: %.3f%n", convertToFeet(meters));
                break;
            case 4:
                System.out.println("Quit");
                break;
            default:
                System.out.println("Invalid selection. Please choose again.");
        }
    }

    public static double convertToKilometers(double meters)
    {
        return meters * 0.001;
    }

    public static double convertToInches(double meters)
    {
        return meters * 39.37;
    }

    public static double convertToFeet(double meters)
    {
        return meters * 3.281;
    }
}



//public class Lab7_Problem2
//{
//    public static void main(String[] args)
//    {
//        Scanner keyboard = new Scanner(System.in);
//        int selection;
//
//        do {
//            showMenu();
//            System.out.println("\nPlease make a selection:");
//            selection = keyboard.nextInt();
//
//            switch (selection) {
//                case 1:
//                    System.out.println("Number of meters?");
//                    double meters1 = keyboard.nextDouble();
//                    if (meters1 <= 0) {
//                        System.out.println("Must be positive");
//                        keyboard.nextLine();
//                        continue;
//                    }
//                    System.out.printf("Converted to Kilometers: %.3f%n",convertToKilometers(meters1));
//                    break;
//                case 2:
//                    System.out.println("Number of meters?");
//                    double meters2 = keyboard.nextDouble();
//                    if (meters2 <= 0) {
//                        System.out.println("Must be positive");
//                        keyboard.nextLine();
//                        continue;
//                    }
//                    System.out.printf("Converted to Inches: %.3f%n", convertToInches(meters2));
//                    break;
//                case 3:
//                    System.out.println("Number of meters?");
//                    double meters3 = keyboard.nextDouble();
//                    if (meters3 <= 0) {
//                        System.out.println("Must be positive");
//                        keyboard.nextLine();
//                        continue;
//                    }
//                    System.out.printf("Converted to Feet: %.3f%n", convertToFeet(meters3));
//                    break;
//                case 4:
//                    System.out.println("Quit");
//                    break;
//                default:
//                    System.out.println("Invalid selection. Please choose again.");
//            }
//        } while (selection != 4);
//    }
//
//    public static void showMenu()
//    {
//        System.out.println("METER CONVERSION");
//        System.out.println("1)  Convert to Kilometers");
//        System.out.println("2)  Convert to Inches");
//        System.out.println("3)  Convert to Feet");
//        System.out.println("4)  Quit the Program");
//    }
//
//    public static double convertToKilometers(double meters)
//    {
//        return meters * 0.001;
//    }
//
//    public static double convertToInches(double meters)
//    {
//        return meters * 39.37;
//    }
//
//    public static double convertToFeet(double meters)
//    {
//        return meters * 3.281;
//    }
//}






//public class Lab7_Problem2 {
//    public static void main(String[] arg) {
//        int selection = 0;
//        do {
//            showMenu();
//            Scanner selectKeyboard = new Scanner(System.in);
//            selection = selectKeyboard.nextInt();
//
//            switch(selection)
//            {
//                switch (selection) {
//                case 1:
//                    System.out.printf("Convert to kilometers is: %.3f%n", convertKilometers(meters));
//                    break;
//                case 2:
//                    System.out.println("Convert to kilometers is: %.3f%n" + convertInches(meters));
//                    break;
//                case 3:
//                    System.out.println("Convert to kilometers is: %.3f%n" + convertFeet(meters));
//                    break;
//                default:
//            }
//
//
//
//
//            if (selection < 1) {
//                System.out.println("invalid selection if not from 1 to 4");
//            }
//        }
//        while (selection >= 1 && selection <= 4);
//
//        Scanner selectMeters = new Scanner(System.in);
//
//        double meters = -1;
//
//
//        do {
//            System.out.println("Number of meters?");
////           meters = selectKeyboard.nextDouble();
//        } while (meters > 0);
//
////        do {
////
////
////            }
////
////        }
//
//    }
//
//    public static void showMenu() {
//        System.out.println("METER CONVERSION");
//        System.out.println("1) Convert to Kilometer");
//        System.out.println("2) Convert to Inches");
//        System.out.println("3) Convert to Feet");
//        System.out.println("4) Quit the Program\n");
//        System.out.println("Please make a selection:");
//    }
//
//    public static double convertKilometers(double meters) {
//        return meters * 0.001;
//    }
//
//    public static double convertInches(double meters) {
//        return meters * 39.37;
//    }
//
//    public static double convertFeet(double meters) {
//        return meters * 3.281;
//    }
//}