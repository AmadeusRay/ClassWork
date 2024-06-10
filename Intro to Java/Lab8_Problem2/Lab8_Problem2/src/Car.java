
/*
Arash Vasheghani
CS\IS 112
Lab 8 Problem2
2/5/2024
*/

/* UML: Car Class

Car
____
-yearModel:String
-make:String
-speed:int
-----------
+Car()
+Car(year:String, m:String)
+setYearModel(year:String):void
+setMake(m:String):void
+setSpeed(s:int):void
+getYearModel:String           // do we show the return values in UML?
+getMake:String
+getSpeed:int
+addAccelerate:void           //to be used in ACarTest's Accelerate method
    int speed+=5              //unsure about formatting
+addBrake:void                //to be used in ACarTest's brake method
    int speed-=5;             //unsure about formatting
 */
public class Car
{
    private String yearModel;
    private String make;
    private int speed;

    public Car()
    {
        this.yearModel = "";
        this.make = "";
    }

    public Car(String year, String m)
    {
        this.yearModel = year;
        this.make = m;
        this.speed = 0;
    }

    //setters
    public void setYearModel(String year)
    {
        this.yearModel = year;
    }

    public void setMake(String m)
    {
        this.make = m;
    }

    public void setSpeed(int s)
    {
        this.speed = s;
    }  // never used

    //getters
    public String getYearModel()
    {
        return this.yearModel;
    }
    public String getMake()
    {
        return this.make;
    }
    public  int getSpeed()
    {
        return this.speed;
    }

    public void addAccelerate()
    {
        this.speed += 5;
    }

    public void addBrake()
    {
        this.speed -= 5;
    }
}
