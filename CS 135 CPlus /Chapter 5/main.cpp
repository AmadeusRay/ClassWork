/*
Arash Vasheghani
CS/IS 135
Chapter 5 - Lab Part 1
 */

#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int daysWorked;
     long double pay = 0.010L, total= 0.00L;

    cout<< "Please enter the number of worked days:" <<endl;
    cin>> daysWorked;
    while (daysWorked <1 || daysWorked >60) {
        cout<<"Invalid number of days."<<endl;
        cout<< "Enter the number of days again:" <<endl;
        cin>> daysWorked;
    }
    for(int count = 1; count<=daysWorked; count++){

        if (count > 1) {
            pay *= 2.00L;
        }
        total += pay;
        cout<<"Day: "<<std::fixed << std::setprecision(2)<<count<<", Payment: "<< pay<<endl;
    }
    cout<<"Total: "<<std::fixed << std::setprecision(2) <<total<<endl;

}
