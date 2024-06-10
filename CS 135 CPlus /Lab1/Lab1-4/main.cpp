/*
Arash Vasheghani
CS/IS 135
Lab #4. The Speed of Sound
 */




#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    float const air(1100.0), water(4900.0), steel(16400.0);
    float distance, mediumData; // didn't think formatting like this would work.
    string medium;
    //Maybe issues with older C++ versions?

    cout<<"Please enter the medium (air, water, or steel):"<<endl;
    cin>>medium;
    if (medium == "air") {
        mediumData = air;

    }
    else if (medium == "water") {
        mediumData = water;
    }
    else if (medium == "steel") {
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

    cout<<"Sound will travel "<<fixed<<setprecision(2)<<distance<<" feet in "<<medium<<" at a speed of "<<mediumData<<" feet per second in "<<timeTraveled<<" seconds."<<endl;
}
