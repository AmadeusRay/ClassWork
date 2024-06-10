import java.util.Scanner;

/*
Arash Vasheghani
CS\IS 112
Lab 7 Problem1
1/31/2024
*/

/*
pseudocode:
Create int numGrade1, numGrade2, numGrade3, numGrade4, numGrade5;
Create Scanner keyboard;

Display "Please enter 5 scores"
input numGrade1
input numGrade2
input numGrade3
input numGrade4
input numGrade5

create int average, is calcAverage (numGrade1, numGrade2, numGrade3, numGrade4, numGrade5)

printLetterGrade using numGrade1,numGrade2,numGrade3,numGrade4,numGrade5
printAverage using average

Value method: int calcAverage  (int score1, score2, score3, score4, score5) // all int
    return average of the 5 scores

// Assignment doesn't say char or string
Value method: String determineGrade (int numGrade)
    if numGrade>=90
        return "A"
    else if numGrade>= 80
        return "B"
    else if numGrade>=70
        return "C"
    else if numGrade>=60
        return "D"
    else
        return "F"

//added last, from main to make cleaner
Void method: printLetterGrade(int score1, int score2, int score3, int score4, int score5)
    Display "Test 1 grade is" determineGrade(score1)
    Display "Test 2 grade is" determineGrade(score2)
    Display "Test 3 grade is" determineGrade(score3)
    Display "Test 4 grade is" determineGrade(score4)
    Display "Test 5 grade is" determineGrade(score5)

Void method: printAverage (int avg)
    Display "Average score is" +avg
    Display "Average grade is" +determineGrade(avg)
 */

public class Lab7_Problem1
{
    public static void main(String[] args)
    {
        int numGrade1, numGrade2, numGrade3, numGrade4, numGrade5;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter 5 scores");
        numGrade1 = keyboard.nextInt();
        numGrade2 = keyboard.nextInt();
        numGrade3 = keyboard.nextInt();
        numGrade4 = keyboard.nextInt();
        numGrade5 = keyboard.nextInt();

        int average = calcAverage(numGrade1, numGrade2, numGrade3, numGrade4, numGrade5);

        //cleaner main with printLetterGrade
        printLetterGrade(numGrade1,numGrade2,numGrade3,numGrade4,numGrade5);
        printAverage(average);
    }

    public static int calcAverage(int score1, int score2, int score3, int score4, int score5)
    {
        return (score1+score2+score3+score4+score5)/5;
    }

    public static String determineGrade(int numGrade)
    {
        if(numGrade>=90)
        {
             return "A";
        }
        else if(numGrade>=80)
        {
            return "B";
        }
        else if(numGrade>=70)
        {
            return"C";
        }
        else if(numGrade>=60)
        {
            return "D";
        }
        else {
            return "F";
        }
    }

    public static void printLetterGrade(int score1, int score2, int score3, int score4, int score5)
    {
        System.out.println("Test 1 grade is "+determineGrade(score1));
        System.out.println("Test 2 grade is "+determineGrade(score2));
        System.out.println("Test 3 grade is "+determineGrade(score3));
        System.out.println("Test 4 grade is "+determineGrade(score4));
        System.out.println("Test 5 grade is "+determineGrade(score5));
    }
    public static void printAverage(int avg)
    {

        System.out.println("Average score is "+avg);
        System.out.println("Average grade is "+determineGrade(avg));
    }
}
