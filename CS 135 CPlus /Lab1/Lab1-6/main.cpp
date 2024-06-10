/*
Arash Vasheghani
CS/IS 135
Chapter 4- Lab #6. Mobile Service Provider 2
 */

#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    char package;
    float gigsUsed;
    float planA, planB, planC;

    cout << "Please enter your package selection (A, B, or C):" << endl;
    cin >> package;

    if (package != 'A' && package != 'B' && package != 'C') {
        cout << "Invalid package selection." << endl;
        return 0;
    }

    cout << "Please enter gigabytes of data used:" << endl;
    cin >> gigsUsed;
    if (gigsUsed < 0 || gigsUsed > 1000)
    {
        cout << "Invalid number of gigabytes." << endl;
        return 0;
    }

    switch (package) {
        case 'A':
            planA = 39.99;
        if (gigsUsed > 4) {
            planA += (10 * (gigsUsed - 4));
        }
        planB = 59.99;
        if (gigsUsed > 8) {
            planB += 5 * (gigsUsed - 8);
        }
        planC = 69.99;
        break;
        case 'B':
            planB = 59.99;
        if (gigsUsed > 8) {
            planB += 5 * (gigsUsed - 8);
        }
        planC = 69.99;
        break;
        case 'C':
            planC = 69.99;
        break;
    }

    if (package == 'A') {
        cout << "Total charges are: $" << planA << endl;
        if (planB < planA) {
          
            cout <<std::fixed<<std::setprecision(2)<< "You could've saved $" << planA - planB << ", if you had chosen package B." << endl;
        }
        if (planA-planC > .2 && planC < planA) {  // There's problaby a better way to do this with more time.
            cout <<std::fixed<<std::setprecision(2)<<"You could've saved $" << planA - planC << ", if you had chosen package C." << endl;
        }
    }

    if (package == 'B') {
        cout << "Total charges are: $" << planB << endl;
        if (planC < planB) {
            cout<<std::fixed<<std::setprecision(2)<< "You could've saved $" << planB - planC << ", if you had chosen package C." << endl; // it was adding .001 or something. So I did set precision.
        }
    }

    if (package == 'C') {
        cout << "Total charges are: $" << planC <<endl;
    }
}