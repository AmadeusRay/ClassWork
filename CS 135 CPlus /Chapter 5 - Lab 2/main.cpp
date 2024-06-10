/*
Arash Vasheghani
CS/IS 135
Chapter 5 - Lab Part 2
 */

#include <iostream>
#include <fstream>
#include <iomanip>
using namespace std;

int main() {
    ifstream inputFile;
    string fileName;
     double number;
    int count = 0;
     double lowNum = 1000000;
     double highNum = 0;
     double total = 0;
     double average = 0;

    cout<<"Please enter the file name or type QUIT to exit:"<<endl;
do{

    cin>>fileName;
    if (fileName == "QUIT") {
        return 0;
    }
    inputFile.open(fileName);
     if (inputFile.is_open()==false) {
         cout<<"File: "<<fileName<<" does not exist."<< std::endl;
         cout<<"Please enter the file name again or type QUIT to exit:"<<endl;
     }


    if  (inputFile) {
        while (inputFile >> number)
        {
            if (lowNum>number) {
                lowNum=number;
            }
            if (highNum<number) {
                highNum=number;
            }
            count++;
            total+=number;
        }    average = total / static_cast<float>(count);
        cout<<"Count: "<<count<<endl;
        cout<<"Lowest: "<<std::fixed<< std::setprecision(3)<<lowNum<<endl;
        cout<<"Highest: "<<std::fixed<< std::setprecision(3)<<highNum<<endl;
        cout<<"Total: "<<std::fixed<< std::setprecision(3)<<total<<endl;
        cout<<"Average: "<<std::fixed<< std::setprecision(3)<< average<<endl;
        inputFile.close();
        return 0;
    }
     } while(inputFile.is_open()==false);


}