/*
Arash Vasheghani
CS/IS 135
Chapter 4 - Lab #2. Body Mass Index
 */

/*PSEUDOCODE
float height, weight;

Display Please enter your height:
Input height
if height less than 1
    Display That's an invalid height then return 0
Display Please enter your weight:
Input weight
    if weight less than 1
    Display That's an invalid weight then return 0

float bmi is weight * 703 / (height * height)

Display BMI = bmi // set for two decimal places to the right

if bmi >= 18.5 && bmi <= 25
    display You are optimal.
if bmi<18.5
    display You are underweight.
if bmi >25
    You are overweight.
 */

#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    float height, weight;
    cout<<"Please enter your height: "<<endl;
    cin>>height;
    if (height <1) {
            cout <<"That's an invalid height."<<endl;
        return 0;
    }
    cout<<"Please enter your weight: "<<endl;
    cin>>weight;
    if (weight <1)
    {
        cout <<"That's an invalid weight."<<endl;
        return 0;
    }
    float bmi = weight * 703 / (height * height);

    cout<<"BMI = "<<setprecision(4)<< bmi <<endl;
    if (bmi>= 18.5 && bmi<= 25) {
        cout<<"You are optimal."<<endl;
    }
    if (bmi<18.5) {
        cout<<"You are underweight."<<endl;
    }
    if(bmi>25) {
        cout<<"You are overweight."<<endl;
    }
}
