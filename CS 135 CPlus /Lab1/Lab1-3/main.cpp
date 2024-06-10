/*
Arash Vasheghani
CS/IS 135
Lab #3. Fat Gram Calculator
 */

/*PSEUDOCODE
 *float calories, fat
Display How many calories does the food have?
Input calories
    if calories < 0 display "Invalid data" return
Display How many fat grams does the food have?
Input fat
    if fat < 0 or fat >=calories display "Invalid data" return 0
calFromFat =  fat * 9
fatPercent = 100*calFromFat / calories

Display The percentage of calories from fat is fatPercent %.

if fatPercent is lower than 30
    display The food is low in fat.
    else display The food is NOT low in fat.
*/

#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    float calories, fat;
    cout<<"How many calories does the food have? "<<endl;
    cin>>calories;
    if(calories < 0) {
        cout<<"Invalid data."<<endl;
        return 0;
    }
    cout<<"How many fat grams does the food have? "<<endl;
    cin>>fat;
    if(fat < 0 || fat>=calories) {
        cout<<"Invalid data."<<endl;
        return 0;
    }

    float calFromFat = fat * 9.0;
    float fatPercent = 100.0*(calFromFat / calories);

    cout<<"The percentage of calories from fat is "<<std::fixed<<std::setprecision(1)<<fatPercent << "%."<<endl;

    if (fatPercent < 30)
        cout<<"The food is low in fat."<<endl;
    else
        cout<<"The food is NOT low in fat."<<endl;

    return 0;
}
