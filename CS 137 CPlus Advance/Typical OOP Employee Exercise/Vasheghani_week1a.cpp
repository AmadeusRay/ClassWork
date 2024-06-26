/*
 * Arash Vasheghani
 * CS/IS 137-1049
 * Assignment 1a
 */

/*Pseudocode
 * Create Employee class with private variables of hourly_pay and num_hours
 * For public, initialize Employee with parameters taking two doubles, hourly_pay and num_hours
 * Make get_gross (hourly pay * num hours), get_fedTax (0.15* get_gross, get_net (get_Gross-get_FedTax-get_StateTax).
 * Have them return as a double. Make the function a const so there's no accidental modifcation.
 *
 * To change private variables. Create functions set_HourlyPay taking in double pay and set_hoursWorked taking in
 * int hours. They will be void.
 *
 * In main, create double payPerHours, and int hoursWorked, both starting at zero. And string name.
 *
 * Create employee (with perPerHour and hoursWorked) from Employee class
 * If time make an input for user name instead so the user can create an employee
 * Ask for hourly pay for the employee and input that to the perPerHour, inputing that into their set_HourPay.
 *
 * Do the same for Enter hours worked where it goes into hoursWorked, inputting that into set_HoursWorked.
 *
 * Set text output as fix set precision 2.
 * The output should say the created employee's Gross Pay, Federal Tax, State Tax, Net Pay with appropriate strings
 * for each output.
 */

#include <iostream>
#include <iomanip>

using namespace std;

class Employee{
private:
    double hourly_pay;
    double num_hours;

public:
    Employee(double, double) : hourly_pay(), num_hours() {}

    double get_Gross() const{
        return hourly_pay*num_hours;
    }

    double get_FedTax() const{
        return 0.15 * get_Gross();
    }

    double get_StateTax() const{
        return 0.07 * get_Gross();
    }

    double get_Net() const{
        return get_Gross()- get_FedTax()-get_StateTax();
    }

    void set_HourlyPay(double pay){
        hourly_pay = pay;
    }

    void set_HoursWorked(int hours)
    {
        num_hours = hours;
    }
};

int main() {
    double payPerHour = 0;
    int hoursWorked = 0;
    string name;

    Employee employee(payPerHour, hoursWorked);

    cout<<"Enter Employee's name:"<<endl;
    getline(cin, name);

    cout<<"Enter hourly pay:"<<endl;
    cin>>payPerHour;
    employee.set_HourlyPay(payPerHour);

    cout<<"Enter hours worked:"<<endl;
    cin>>hoursWorked;
    employee.set_HoursWorked(hoursWorked);

    cout<< fixed << setprecision(2);

    cout<<"Gross Pay: $"<<employee.get_Gross()<<endl;
    cout<<"Federal Tax: $"<<employee.get_FedTax()<<endl;
    cout<<"State Tax: $"<<employee.get_StateTax()<<endl;
    cout<<"Net Pay: $"<<employee.get_Net()<<endl;
}
