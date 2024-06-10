/*
Arash Vasheghani
CS\IS 112
Lab 8 Problem1
2/5/2024
*/

/* UML: Employee Class
// I'm not sure how detailed you want the UML or if I'm doing this right.
Employee
--------
-name:String
-idNumber:String
-department:String
-position:String
-yearsWorked:int
-----------------
+Employee()
+Employee(n:String, id:String)
+Employee(n:String, id:String, dpt:String, pos:String, years:int)
+setName(n:String):void
+setId(id:String):void
+setDepartment(dpt:String):void
+setPosition(pos:String):void
+setYearsWorked(years:int):void
+getName():String
+getId():String
+getDepartment():String
+getPosition():String
+getYearsWorked():int
 */

public class Employee
{
    private String name;
    private String idNumber;
    private String department;
    private String position;
    private int yearsWorked;

    public Employee()   // the file came with indentations a different way
    {                   // so I'm indenting all of them because I assume that's what you want
                        // Or maybe my IDE organized the class file.
        this.name = "";
        this.idNumber = "";
        this.department = "";
        this.position = "";
        this.yearsWorked = 0;
    }

    public Employee(String n, String id)
    {
        this.name = n;
        this.idNumber = id;
        this.department = "";
        this.position = "";
        this.yearsWorked = 0;
    }

    public Employee(String n, String id, String dpt, String pos, int years)
    {
        this.name = n;
        this.idNumber = id;
        this.department = dpt;
        this.position = pos;
        this.yearsWorked = 0;
        if (years > 0)
        {
            this.yearsWorked = years;
        }

    }

    public void setName(String n)
    {
        this.name = n;
    }

    public void setID(String id)
    {
        this.idNumber = id;
    }

    public void setDepartment(String dpt)
    {
        this.department = dpt;
    }

    public void setPosition(String pos)
    {
        this.position = pos;
    }

    public void setYearsWorked(int years)
    {
        if (years > 0) {
            this.yearsWorked = years;
        }
    }

    public String getName()
    {
        return this.name;
    }

    public String getID()
    {
        return this.idNumber;
    }

    public String getDepartment()
    {
        return this.department;
    }

    public String getPosition()
    {
        return this.position;
    }

    public int getYearsWorked()
    {
        return this.yearsWorked;
    }
}