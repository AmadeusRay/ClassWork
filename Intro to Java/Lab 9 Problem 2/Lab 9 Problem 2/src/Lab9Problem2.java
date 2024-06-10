import java.util.Random;
import java.util.Scanner;

/*
Arash Vasheghani
CS\IS 112
Lab 9 Problem 2
2/7/2024
*/

/*
PSEUDOCODE-
Create final int SIZE set to 10
Create String[][] sky equal to new String[SIZE][SIZE] // probably should set each array variable with different name
Create Random rand with a seed of 1701                // but they are constantly 10, both. Avoid confusion.
Create Scanner scanner

for iteration: i = 0; i < SIZE; post-increment i   // probably a bad idea to use i and j since they look the same
    for iteration: int j = 0; j < SIZE; post increment j  // won't do that again.
        Create randomValue from rand.next bound to 15
        if randomValue is 0
            sky[i][j] becomes "*"
        else if randomValue is 1 or randomValue is 2
            sky[i][j] becomes "."
        else
            sky[i][j] becomes " "

while true
    Display "Where to put the satellite on row (0-9) and column (0-9)?"
    create int row as scanner.nextInt
    create int col = scanner.nextInt
    if sky[row][col] is "*"
        display "Occupied, enter another row and column"
    else
        sky[row][col] becomes "@"
        break;              //need?

Print line "Starry night"
Print " "   //for alignment of top row
For Iteration: int i as 0; i < SIZE; post increment i
    if i not equal 9        // quick fix to backspace after 9 in top row
        print i + " "           top row
        else
        print i
    print new line

    For Iteration: int i is 0; i < SIZE; post increment i
        print i + " "
        For Iteration: int j is 0; j < SIZE; post increment j
            print sky[i][j] + " "
        print newline
 */

public class Lab9Problem2
{
    public static void main(String[] args)
    {
        final int SIZE = 10;
        String[][] sky = new String[SIZE][SIZE];  // same size
        Random rand = new Random(1701); // Seed set to 1701
        Scanner scanner = new Scanner(System.in);

        // Populate the sky
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                int randomValue = rand.nextInt(15); // Random value between 0 and 14
                if (randomValue == 0)
                {
                    sky[i][j] = "*";
                }
                else if (randomValue == 1 || randomValue == 2)
                {
                    sky[i][j] = ".";
                } else {
                    sky[i][j] = " ";
                }
            }
        }

        // Satellite location
        while (true)
        {
            System.out.println("Where to put the satellite on row (0-9) and column (0-9)?");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

           if (sky[row][col].equals("*"))   // using == did work... or maybe I need sleep
           {
                System.out.println("Occupied, enter another row and column");
            }
           else
           {
                sky[row][col] = "@";
                break;  // don't delete. Needed.
           }
        }

        // final print of starry night
        System.out.println("Starry night");
        System.out.print("  "); // Space for alignment with row numbers
        for (int i = 0; i < SIZE; i++)
        {
            if (i!=9)// it shows after 9 there's no space. This is my hacky solution because of poor sleeping habits.
            {
            System.out.print(i + " ");
            }
            else
            {
                System.out.print(i);
            }
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++)
        {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++)
            {
                System.out.print(sky[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// I wish my code was more organized. Difficulty with arrays.
