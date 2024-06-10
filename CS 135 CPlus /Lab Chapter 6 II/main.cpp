/*
Arash Vasheghani
CS/IS 135
Chapter 6 - Lab Part 2
 */

#include <iostream>
using namespace std;

bool isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i * i <= num; ++i) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

void findPrimes(long long anyNumber) {
    for (int i = 1, s=1; i <= anyNumber; ++i, s++) {
        if (isPrime(i) == true && i != 1) {
            if (s == 1)                       // to fix the last space issue. Best solution is put in array to know
            {                                 // how many numbers there are then not do a space on the last number.
            cout<<i<<" ";
            }
            if (s == 2)
            {
                cout<<i;
            }
            if (s > 2)
            {
                cout<<" "<<i;
            }
        }
    }
    cout<<endl;
}

int main() {
    int number;
    std::cout << "Enter a number:"<<endl;
    std::cin >> number;
    while (number < 2) {
        cout<<"That's not a valid number. Please re-enter:";
        cin>>number;
    }
    findPrimes(number);
    return 0;
}