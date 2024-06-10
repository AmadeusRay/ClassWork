/*
Arash Vasheghani
CS/IS 135
Chapter 4- Lab #5. Mobile Service Provider
 */

#include <iostream>
using namespace std;

int main()
{
    char package;
    float gigsUsed;
    float plan;

    cout<<"Please enter your package selection (A, B, or C):"<<endl;
    cin>>package;

    if (package != 'A' && package != 'B' && package != 'C') {
        cout<<"Invalid package selection."<<endl;
        return 0;
    }

    cout<<"Please enter gigabytes of data used:"<<endl;
    cin>>gigsUsed;
    if (gigsUsed < 0 || gigsUsed >1000)
    {
        cout<<"Invalid number of gigabytes."<<endl;
        return 0;
    }

    switch(package) {
        case 'A':
            plan = 39.99;
        if (gigsUsed>4) {
            plan += (10 * (gigsUsed-4));
        }
        break;
        case 'B':
            plan = 59.99;
        if (gigsUsed>8) {
            plan += 5 * (gigsUsed-8);}
        break;
        case 'C':
            plan = 69.99;
        break;
        // default:
        //     cout<<"Invalid package selection."<<endl; //redudant
        // return 0;
    }
    cout<<"Total charges are: $"<<plan;

}
