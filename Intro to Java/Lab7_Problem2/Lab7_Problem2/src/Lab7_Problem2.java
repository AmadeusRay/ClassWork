import java.util.Scanner;

/*
Arash Vasheghani
CS\IS 112
Lab 7 Problem2
2/1/2024
*/

/*
** don't allow negative numbers for the meters input
** should be continuous until user quits

pseudocode:

do
    create int menuSelection // IDE wants it here

    do
        create double meters = 0
        showMenu
        create Scanner menuKeyboard
        input menuSelection from menuKeyboard
        if menuSelection not 4
            do
                Create Scanner metersKeyboard
                Display "Number of meters?"
                input meters from metersKeyboard
                if meters<=0
                    Display "Must be positive"
            while meters<=0

            switch MenuSelection // 3 decimal places for the three selections
                case 1: Display "Convert to kilometers is: ", convertKilometers(meters)
                        break
                case 2: Display "Convert to inches is: ", convertInches(meters)
                        break
                case 3: Display "Convert to feet is: ", convertFeet(meters)
                        break
    while menuSelection !=4
   Display "Quit"

   Void method : showMenu
    Display METER CONVERSION
            1) Convert to Kilometers
            2) Convert to Inches
            3) Convert to Feet
            4) Quit the Program

            Please make a selection:

    Value method: convertKilometers taking double meters
        return meters * 0.001

    Value method:  convertInches taking double meters
        return meters * 39.37

    Value method convertFeet taking double meters
        return meters * 3.281
 */

public class Lab7_Problem2
{
    public static void main(String[] arg)
    {
        int menuSelection;

        do  // loop menu after completion
        {
            double meters = 0;
            showMenu();
            Scanner menuKeyboard = new Scanner(System.in);
            menuSelection = menuKeyboard.nextInt();

            if (menuSelection!=4)
            {
                do {
                    Scanner metersKeyboard = new Scanner(System.in);
                    System.out.println("Number of meters?");
                    meters = metersKeyboard.nextDouble();
                    if (meters <= 0)
                    {
                        System.out.println("Must be positive");
                    }
                } while (meters <= 0);

                switch (menuSelection)
                {
                    case 1:
                        System.out.printf("Convert to kilometers is: %.3f%n", convertKilometers(meters));
                        break;
                    case 2:
                        System.out.printf("Convert to inches is: %.3f%n", convertInches(meters));
                        break;
                    case 3:
                        System.out.printf("Convert to feet is: %.3f%n", convertFeet(meters));
                        break; // probably don't need this
                }
            }
        } while(menuSelection != 4);  // end loop menu after completion, 4 selected
        System.out.println("Quit");
    }

    public static void showMenu()
    {
        System.out.println("METER CONVERSION");
        System.out.println("1)  Convert to Kilometers");
        System.out.println("2)  Convert to Inches");
        System.out.println("3)  Convert to Feet");
        System.out.println("4)  Quit the Program\n");
        System.out.println("Please make a selection:");
    }

    public static double convertKilometers(double meters)
    {
    return meters * 0.001;
    }

    public static double convertInches(double meters)
    {
        return meters * 39.37;
    }

    public static double convertFeet(double meters)
    {
        return meters * 3.281;
    }
}
