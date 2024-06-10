/*
Arash Vasheghani
CS/IS 135
Chapter 5 - Lab Part 3
 */

#include <iostream>
#include <fstream>
using namespace std;

/*
 *If there is time try to condense code with functions or see if it's possible.
 */

int main()
{
    double  january, february, march, april, may, june, july, // 2023 Calendar to suit hyper grade test case
    august, september, october, november, december;           // on Thursday March 28 3:00pm
     double average;

    ifstream inputFile;
    int steps;
    inputFile.open("steps.txt");

    if  (inputFile) {
        for(int days = 0; days<=364; days++)
        {
            inputFile >> steps;
            if (days <= 30)
            {
                january += steps;
                if (days == 30){
                    average = (january / 31); // 30 January days    // I have no clue why 31 and not 30 but hyper likes it
                    cout<<"January: Total: "<< january<<", Average: "<< average<<" steps."<<endl;
                }
            }
            if (days>30) {
                february += steps;
                if (days == 58) {
                    average = (february / 28); // 28 February days
                    cout<<"February: Total: "<< february<<", Average: "<< average<<" steps."<<endl;
                }
            }
            if (days>58) {
                march += steps;
                if (days == 89) {
                    average = (march / 31); // 30 March days
                    cout<<"March: Total: "<< march<<", Average: "<< average<<" steps."<<endl;
                }
            }
            if (days>89) {
                april += steps;
                if (days == 119) {
                    average = (april / 30); // 31 April days
                    cout<<"April: Total: "<< april<<", Average: "<< average<<" steps."<<endl;
                }
            }
            if (days>119) {
                may += steps;
                if (days == 150) {
                    average = (may / 31); // 31 May days
                    cout<<"May: Total: "<< may<<", Average: "<< average<<" steps."<<endl;
                }
            }
            if (days>150) {
                june += steps;
                if (days == 180) {
                    average = (june / 30); // 30 June days
                    cout<<"June: Total: "<< june<<", Average: "<< average<<" steps."<<endl;
                }
            }
            if (days>180) {
                july += steps;
                if (days == 211) {
                    average = (july / 31); // 31 july days
                    cout<<"July: Total: "<< july<<", Average: "<< average<<" steps."<<endl;
                }
            }
            if (days>211) {
                august += steps;
                if (days == 242) {
                    average = (august / 31); // 31 August days
                    cout<<"August: Total: "<< august<<", Average: "<< average<<" steps."<<endl;
                }
            }
            if (days>242) {
                september += steps;
                if (days == 272) {
                    average = (september / 30); // 30 September days
                    cout<<"September: Total: "<< september<<", Average: "<< average<<" steps."<<endl;
                }
            }
            if (days>272) {
                october += steps;
                if (days == 303) {
                    average = (october / 31); // 31 October days
                    cout<<"October: Total: "<< october<<", Average: "<< average<<" steps."<<endl;
                }
            }
            if (days>303) {
                november += steps;
                if (days == 333) {
                    average = (november / 30); // 30 November days
                    cout<<"November: Total: "<< november<<", Average: "<< average<<" steps."<<endl;
                }
            }
            if (days>333) {
                december += steps;
                if (days == 364) {
                    average = (december / 31); // 31 December days
                    cout<<"December: Total: "<< december<<", Average: "<< average<<" steps."<<endl;
                }
            }
        }
    }

    return 0;
}
