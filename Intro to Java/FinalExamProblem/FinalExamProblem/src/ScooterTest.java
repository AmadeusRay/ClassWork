import java.text.DecimalFormat;

/*  Arash Vasheghani
CS\IS 112
Final Exam-ScooterTest
2/8/2024
*/

/*I assume no pseudo code */

public class ScooterTest
{
    public static void main (String[] arg)
    {
        Scooter scooter1 = new Scooter("Segway Ninbot", 25.99, 5);
        Scooter scooter2 = new Scooter();
        Scooter scooter3 = new Scooter("Gotrax GXL", 16.97, 4);

        scooter2.setName("Xiaomi Mi");
        scooter2.setRate(20.49);
        scooter2.setDays(2);

        printScooter(scooter1, scooter2, scooter3);
    }

    // If we had user input, I would have made the program more dynamic.
    // Because we have a set amount of scooters (3 scooters) and no user input, then...
    // I hardcode those three scooters via the arguments / parameters since there will be no change from a user
    // I would also utilize set price probably, and the private price data so a log would be kept for each customer.
    public static void printScooter(Scooter scooter1, Scooter scooter2, Scooter scooter3)
    {                                                        //IntelliJ & Jgrasp format itemized totals differently
        DecimalFormat df = new DecimalFormat("#.##"); //I formatted according to what looks best for jgrasp
        System.out.println("Scooter's name\t"+"Price per day\t"+"# of days\t"+"Itemized totals");
        System.out.println(scooter1.getName()+"\t$"+scooter1.getRate()+"\t\t\t"+scooter1.getDays()+"\t\t\t\t$"+scooter1.getPrice());
        System.out.println(scooter2.getName()+"\t\t$"+scooter2.getRate()+"\t\t\t"+scooter2.getDays()+"\t\t\t\t$"+scooter2.getPrice());
        System.out.println(scooter3.getName()+"\t\t$"+scooter3.getRate()+"\t\t\t"+scooter3.getDays()+"\t\t\t\t$"+scooter3.getPrice());
        System.out.println();
        System.out.println("Total Price: $"+df.format(totalPrice(scooter1,scooter2,scooter3)));
    }

    public static double totalPrice(Scooter scooter1, Scooter scooter2, Scooter scooter3)    // bill method
    {
        return (scooter1.getPrice()+scooter2.getPrice()+scooter3.getPrice());
    }
}

// The labs were fun, except the arrays. Have a good one professor Tony.