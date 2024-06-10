/*
Arash Vasheghani
CS/IS 135
Lab 1-4
 */

/*PSEUDOCODE
float air(1100), water(4900), steel(16400), distance;



Display Please enter the medium (air, water, or steel):
Input type
if matter is air water or steel
    Display Please enter the distance (in feet):
    if distance < 0
        display Invalid distance then return 0
else
    Display Invalid medium then return 0
    Switch(medium)
        Case air, mediumData = air
        etc with the rest
    default display Invalid medium. then return 0

float timeTraveled is  medium / distance;

display Sound will travel #distance feet in #mediumData at a speed of #mediumData feet per second in #timeTraveled seconds.

 */


#include <iostream>
#include <iomanip>
#include <locale> // for comma separators
#include <sstream> // for string manipulation
using namespace std;

int main()
{
    float const air(1100.0), water(4900.0), steel(16400.0);
    float distance, mediumData; // didn't think formatting like this would work.
    string medium;

    // Set locale for comma separators
    cout.imbue(std::locale(""));

    cout<<"Please enter the medium (air, water, or steel):"<<endl;
    getline(cin, medium);
    // Convert medium to uppercase
    for(char &c : medium) {
        c = toupper(c);
    }

    if (medium == "AIR") {
        mediumData = air;
    }
    else if (medium == "WATER") {
        mediumData = water;
    }
    else if (medium == "STEEL") {
        mediumData = steel;
    }
    else {
        cout<<"Invalid medium."<<endl;
        return 0;
    }

    cout<<"Please enter the distance (in feet):"<<endl;
    cin>>distance;
    if (distance <0) {
        cout<<"Invalid distance."<<endl;
        return 0;
    }

    float timeTraveled = distance / mediumData;

    // Add comma separators
    stringstream formattedDistance;
    formattedDistance.imbue(std::locale(""));
    formattedDistance << fixed << setprecision(2) << distance;
    cout<<"Sound will travel "<<formattedDistance.str()<<" feet in "<<medium<<" at a speed of "<<mediumData<<" feet per second in "<<timeTraveled<<" seconds."<<endl;
}