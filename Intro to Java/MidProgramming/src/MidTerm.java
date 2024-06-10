import java.util.Scanner;

/*
Arash Vasheghani
CS\IS 112
Midterm Program - Buy a Pond Fish
1/25/2024
*/

/*  **Question did not state to repeat the menu. If time permits try with do while**
    **Don't get clever and try to make optionPrice a constant. It needs to change to $0.00.**

Pseudocode:
Create String name, fishType, optionFood
Create double deliveryCharge, price, total
Create int fishSelected, optionSelected
Create Scanner keyboard;

Display "What is your name?"
input name

Do
    Display
        "Pet                           Delivery Charge     Price

        1: Kohaku High Quality Koi    $5                  $24.99

        2: Tri-colored Koi            $7                  $109.99

        2: Red Ryukin Goldfish        $6                  $26.99

        The price for the optional premium fish food is $39.95.

        Please type in the meal number of the fish you want."

        input fishSelected
        Switch fishSelected
            case 1
                deliveryCharge is 5
                price is 24.99
                fishType is "Kohaku High Quality Koi"
                break
            case 2
                deliveryCharge is 7
                price is 109.99
                fishType is "Tri-colored Koi"
                break
            case 3
                deliveryCharge is 6
                price is 26.99
                fishType is "Red Ryukin Goldfish"
                break
            default
                display "Sorry, I didn't understand your choice. Please try again."
While fish selected is less than 1 or fish selected greater than 3

total is price plus deliveryCharge


Do
    Display "Would you like the optional fish food? 1 for yes, 2 for no."
    input optionSelected;
    if optionSelected is 1
        Add optionPrice to total
        optionFood is "Premium Fish food"
    else
        optionPrice is 0
        Option is "No Fish Food"
While optionSelected is less than 1 and optionSelected is greater than 2

Display //money with .2f
    Hello +name !
    Your fish is as follows:
    fishType
    Delivery Charge     $deliveryCharge
    Price               $price
    optionFood          $optionPrice
    Total               $total

 // still shows price when option 2 selected or optionSelected. Solution would involve an if statement and
 // repeating the invoice display code within it without option price. Seems like not a clean way to do it.
 // Settled on just showing $0.00 like a real invoice.
 */


public class MidTerm
{
    public static void main (String[] arg)
    {
        String name, fishType = null, optionFood; // ide wanted me to initialize fish type
        double deliveryCharge = 0, price = 0, optionPrice = 39.95, total;
        // making deliveryCharge double, so I don't have to think about it
        int fishSelected, optionSelected;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        do { // could probably not use so many \t mess with formatting last
            System.out.printf("Pet      \t\t\t\t\tDelivery Charge   \tPrice\n");
            System.out.printf("1: Kohaku High Quality Koi \t$5      \t\t\t$24.99\n");
            System.out.printf("2: Tri-colored Koi        \t$7       \t\t\t" + "$109.99\n");
            System.out.printf("3: Red Ryukin Goldfish    \t$6       \t\t\t$26.99\n\n");
            System.out.printf("The price for the optional premium fish food is $39.95.\n");

            System.out.printf("Please type in the meal number of the fish you want.\n");
            fishSelected = keyboard.nextInt();

            switch (fishSelected) {
                case 1:
                    deliveryCharge = 5;
                    price = 24.99;
                    fishType = "Kohaku High Quality Koi";
                    break;
                case 2:
                    deliveryCharge = 7;
                    price = 109.99;
                    fishType = "Tri-colored Koi";
                    break;
                case 3:
                    deliveryCharge = 6;
                    price = 26.99; // total kept being off by a penny. Keep an eye on it.
                    fishType = "Red Ryukin Goldfish";
                    break;
                default:
                    System.out.println("\nSorry, I didn't understand your choice. Please try again.");
            }
        }
        while (fishSelected <1 || fishSelected >3);

        total = price + deliveryCharge;

        do {
            System.out.println("Would you like the optional fish food? 1 for yes, 2 for no.");
            optionSelected = keyboard.nextInt();

            if (optionSelected == 1) {
                total += optionPrice;
                optionFood = "Premium fish food";
            } else {
                optionPrice = 0;
                optionFood = "No Fish Food     "; //spaces to offset formatting issue when 1 is selected for optional...
                //... fish. When 2 is selected it's perfect. Best solution so far to make both options spaced right
            }
            // I could probably add some error thing when they type the wrong number
            // and ask them to repeat
        }
        while (optionSelected < 1 || optionSelected >2);

        System.out.println("\nHello " + name + "!\n");
        System.out.println("Your fish is as follows:\n\n");
        System.out.println(fishType+"\n");
        System.out.printf("   Delivery Charge       $%.2f\n\n", deliveryCharge);
        System.out.printf("   Price                 $%.2f\n\n", price);
        System.out.printf("   %s     $%.2f\n\n", optionFood, optionPrice);
        System.out.printf("   Total                 $%.2f\n", total);
    }
}

