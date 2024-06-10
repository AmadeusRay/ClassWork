import java.util.Scanner;
import java.io.*;

/*
Arash Vasheghani
CS\IS 112
Lab 6 Problem2
1/29/2024
*/

/*
Use a while loop that reads the values, prints each value, sum each value, and finds the highest value.
Print the highest and total then close the file. Also set the highest number to zero before reading the numbers
from a file (assume only positive values), nextInt() and not string.

psuedocode:
Create int previousNumber(0), highestNumber(0), total(0)
Create Scanner keyboard

Display "Enter the file name: "
Create String filename

Create File dataFile from filename
Create Scanner inputFile from dataFile;

While inputFile
    Create int number from inputfile **using nextInt as requested**
    Display Number
    Accumulate total from number

    if number is greater than previousNumber
        highestNumber equals number
    previousNumber equals number

   Display "Highest value is "+highestNumber+" and total is"+total
   Close inputFile

 */
public class Lab6_Problem2
{
    public static void main(String[] arg) throws IOException
    {
        int previousNumber = 0, highestNumber = 0, total=0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter file name");
        String filename = keyboard.nextLine();

        File dataFile = new File(filename);     // Example said File (type) file (name). Not sure if that was ok.
        Scanner inputFile = new Scanner(dataFile);

        while (inputFile.hasNext())
        {

            int number = inputFile.nextInt();
            System.out.println(number);
            total+=number;

            if(number>previousNumber)
            {
                highestNumber = number;
            }
            previousNumber = number;
        }
        System.out.println("Highest value is "+highestNumber+" and total is " +total);
        inputFile.close();
    }
}
