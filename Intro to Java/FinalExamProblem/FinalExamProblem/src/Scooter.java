/*
Arash Vasheghani
CS\IS 112
Final Exam-Scooter
2/8/2024
*/

/* UML: Scooter Class

Scooter
--------
-name:String
-rate:double
-days:int
-price:double // did not need
-----------------
+Scooter()
+Scooter(scooterName:String, scooterRate:Double, scooterDays:int)

+setName(nameToSet:String):void
+setRate(rateToSet:double):void
+setDays(daysToSet:int):void
+setPrice(priceToSet:double):void    //did not need a setter for price

+getName():String
+getRate():double
+getDays():int
+getPrice():double
 */

public class Scooter
{
    private String name;
    private double rate;
    private int days;
    private double price; // Did not need this in the program,and it was never asked in the question.

    public Scooter()
    {
        this.name = "";
        this.rate = 0;
        this.days = 0;
    }

    public Scooter(String scooterName, Double scooterRate, int scooterDays)
    {
        this.name = scooterName;
        this.rate = scooterRate;
        this.days = scooterDays;
    }

    //setters
    public void setName(String nameToSet)
    {
        this.name = nameToSet;
    }

    public void setRate(double rateToSet)
    {
        if (rateToSet >= 0)               //Do not allow number of days and rate to be less than zero
        {
            this.rate = rateToSet;
        }
    }

    public void setDays(int daysToSet)
    {
        if (daysToSet >= 0)               //Do not allow number of days and rate to be less than zero
        {
            this.days = daysToSet;
        }
    }

    public void setPrice(int priceToSet)   //did not use it the program although requested in question
    {
            this.price = priceToSet;
    }

    //getters
    public String getName()
    {
        return this.name;
    }

    public double getRate()
    {
        return this.rate;
    }

    public int getDays()
    {
        return this.days;
    }
    public double getPrice()   // part of bill method
    {
        return rate*days;
    }
}