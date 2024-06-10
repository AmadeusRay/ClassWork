import java.util.Scanner;

/*
Arash Vasheghani
CS\IS 112
Lab 5 Problem 1
1/24/2024
*/

/*
pseudocode:
create int choice as 0;
create double radius;
create final double PI as Math.PI
Create Scanner keyboard;

do
    Display "CIRCLE CALCULATOR MENU"
    Display "1) Calculate the Area of a Circle"
    Display "2) Calculate the Circumference of a Circle"
    Display "3) Quit the Program" with extra newline
    Display "Make a selection by choosing a number:
    Input to choice

    if choice is 1
        Display "What is radius?"
        Input to radius as double
        create double area = pi * radius * radius
        Display with printf "Area is" area;          //format to 4 decimals, .4f
     if choice is 2
        Display "What is radius?"
        Input to radius as double
        create double circumference = 2 * radius * PI
        Display with printf "Circumference is" area  // format to 4 decimals, .4f

      else if choice is less than 1 or choice is more than 3
        Display "You have made an invalid selection"

while choice is not 3

if choice is 3
    output "You have chosen to quit the program"
 */


public class Lab5_Problem1
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

            if(choice == 1)
            {
                System.out.println("What is radius?");
                radius = keyboard.nextDouble();
                double area = PI * radius * radius;
                System.out.printf("Area is %.4f\n", area);
            }
            else if(choice == 2)
            {
                System.out.println("What is radius?");
                radius = keyboard.nextDouble();
                double circumference = 2 * radius * PI;
                System.out.printf("Circumference is %.4f\n", circumference);
            }
            else if (choice <1 || choice >3)
            {
                System.out.println("You have made an invalid selection");
            }
        }
        while(choice !=3);

        if (choice == 3) // For safety
            // Should technically work regardless when it reaches this point
        {
            System.out.println("You have chosen to quit the program");
        }
    }
}
