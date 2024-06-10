import java.util.Scanner;
/*  Arash Vasheghani
CS\IS 112
Lab 8 Problem1
2/5/2024   */
public class AEmployeeTest
{
    public static void main (String[] arg)
    {
        Employee employee1 = new Employee("Jenny Jacobs", "JJ8990", "   Accounting", "  President", 15);
        Employee employee2 = new Employee(" Myron Smith","MS7571");
        employee2.setDepartment("           IT");
        employee2.setPosition(" Programmer ");
        Employee employee3 = new Employee();
        employee3.setName("Chris Raines");  // I'm not sure if I'm following the assignment properly. You want us to set this information for practice?
        employee3.setID("CR6873");          // I'm aware I can use a constructor. But this is how I'm interpreting the instructions.
        employee3.setDepartment("Manufacturing");
        employee3.setPosition("   Engineer");
        System.out.println("How many years has Myron Smith worked for the company?");
        Scanner keyboard = new Scanner(System.in);
        employee2.setYearsWorked(keyboard.nextInt());
        System.out.println("How many years has Chris Raines worked for the company?");
        employee3.setYearsWorked(keyboard.nextInt());
        printEmployee(employee1); printEmployee(employee2); printEmployee(employee3);  // I don't usually format like this, only to meet the 30 lines requirement
    }
    public static void printEmployee(Employee employee)
    {
        System.out.println(employee.getName()+" "+employee.getID()+" "+employee.getDepartment()+" "+employee.getPosition()+" "+employee.getYearsWorked());
    }
}



