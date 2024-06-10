import java.util.Scanner;
import java.util.Random;

/*
Arash Vasheghani
CS\IS 112
Lab 9 Problem 1
2/7/2024
*/

/*
PSEUDOCODE

Create random as new Random with a seed of 42

display "Size of the array?"
Create Scanner keyboard
int size = keyboard input with nextInt

Create int[] numbers as new int[size];
For iteration: int i equal 1; i < size, i++
   Create int randomNum as random.nextInt bound to 100
   numbers[i] as randomNumber

bubble using numbers

for int x through numbers
    display x + " "
print "\n"

Void Method bubble taking int [] values
    create boolean swap
    create int pass as 1
    do
        swap becomes false
        create int temp
        for int count = 0; count < values.length - pass; count ++
            if value[count] is greater than values[count+1]
                temp becomes value[count]
                values[count] becomes values[count+1]
                values[count+1] becomes temp
                swap becomes true
        pass++
    while swap
 */


public class Lab9_Problem1
{
    public static void main(String[] arg)
    {
        Random random = new Random(42);

        System.out.println("Size of the array?");
        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i<size; i++)
        {
            int randomNumber = random.nextInt(100);
            numbers[i] =  randomNumber;
        }

        bubble(numbers);

        for(int x: numbers)
        {
            System.out.print(x+" ");
        }
        System.out.print("\n"); // hyper-grade wanted this ¯\_(ツ)_/¯
    }

    public static void bubble(int [] values)
    {
        boolean swap;
        int pass = 1;
        do
        {
            swap = false;
            int temp;
            for (int count = 0; count < values.length - pass; count++)
            {
                if (values[count] > values[count+1])
                {
                    temp = values[count];
                    values[count] = values[count+1];
                    values[count+1] = temp;
                    swap = true;
                }
            }
            pass++;
        } while (swap);
    }
}
