import java.util.Scanner;

/*
Arash Vasheghani
CS\IS 112
Lab 5 Problem 2
1/24/2024
*/

/*
Take program 1 and change it to use the SWITCH/CASE statement

psuedocode:
create int choice as 0
Create double radius;
Create final double PI as Math.PI
Create Scanner keyboard;

//loop the menu choices, so it comes back to it unless it's an exit for selection 3
Do
    Display "CIRCLE CALCULATOR MENU"
    Display "1) Calculate the Area of a Circle"
    Display "2) Calculate the Circumference of a Circle"
    Display "3) Quit the Program" with extra newline
    Display "Make a selection by choosing a number:

    Input to choice
    Switch choice
        case 1
            Display "What is radius?"
            Input to radius;
            Create double area = pi * radius * radius
            Display with printf "Area is" area;          //format to 4 decimals, .4f
            Break

        case 2
            Display "What is radius?"
            Input to radius;
            create double circumference = 2 * radius * PI
            Display with printf "Circumference is" area  // format to 4 decimals, .4f
            Break

         case 3
             Output "You have chosen to quit the program"
             Break

         default
            Display "You have made an invalid selection"
 while choice is not 3

 */

public class Lab5_Problem2
{
    public static void main(String[] arg)
    {
        int choice = 0;
        double radius;
        final double PI = Math.PI;
        Scanner keyboard = new Scanner(System.in);

        do
        {
            System.out.println("CIRCLE CALCULATOR MENU:");
            System.out.println("1)  Calculate the Area of a Circle");
            System.out.println("2)  Calculate the Circumference of a Circle");
            System.out.println("3)  Quit the Program\n");
            System.out.println("Make a selection by choosing a number:");
            choice = keyboard.nextInt();

        switch(choice) {

            case 1:
                System.out.println("What is radius?");
                radius = keyboard.nextDouble();
                double area = PI * radius * radius;
                System.out.printf("Area is %.4f\n", area);
                break;

            case 2:
                System.out.println("What is radius?");
                radius = keyboard.nextDouble();
                double circumference = 2 * radius * PI;
                System.out.printf("Circumference is %.4f\n", circumference);
                break;

            case 3:
                System.out.println("You have chosen to quit the program");
                break;

            default:
                System.out.println("You have made an invalid selection");
                }
        }
        while (choice !=3);
    }
}
