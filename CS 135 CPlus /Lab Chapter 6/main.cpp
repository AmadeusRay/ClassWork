/*
Arash Vasheghani
CS/IS 135
Chapter 6 - Lab Part 1
 */

#include <iostream>
using namespace std;

long long numberInput;

bool isPrime(long long num) {
    if (num <= 1) {
        return false;
    }
    for (long long i = 2; i * i <= num; ++i) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

int main() {
    do {\
        cout<<"Please enter a number to check for primality or -1 to exit:"<<endl;;
        std::cin >> numberInput;
        if (numberInput != -1) {
            isPrime(numberInput) ? cout <<numberInput<<" is a prime number.\n" : cout << numberInput<<" is not a prime number.\n";
        }
    } while (numberInput != -1);
}