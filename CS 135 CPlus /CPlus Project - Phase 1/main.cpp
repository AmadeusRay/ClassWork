/*
Arash Vasheghani
CS/IS 135
Employee System Project - Phase 1
 */

/*
*b) Initialize resources, such as opening any files needed, creating memory data structures, etc. This
step most likely will not be needed for Phase 1.
// Confusing if I should do this or not?
 */

#include <iostream>
#include <limits> //something with the string case for int input valid or it'll loop.
#include "menu.h"

using namespace std;

void notImplemented() {
    std::cout << "This feature is not implemented yet." << std::endl;
}

//these should have it's own header but was not requested.
void addEmployee() {
    notImplemented();
}

void findEmployeeId() {
    notImplemented();
}

void findEmployeeName() {
    notImplemented();
}

void deleteEmployee() {
    notImplemented();
}

void displayStatistics() {
    notImplemented();
}

void displayAllEmployees() {
    notImplemented();
}

void importFromFile() {
    notImplemented();
}

void exportToFile() {
    notImplemented();
}

int main() {
    int selection;
    int employeeID; // should always be positive
    string employeeName;
    string employeeDept;
    string employeeTitle;
    float employeeSalary; // specific decimal points. Don't want to do this until we actually start using it.

    cout << "Welcome to Employee Management System (EMS)\n"; // no repeating welcome message after this

    do{
        menu();
        cout << "Enter you selection (1..9):"<<endl;
        cin >> selection;
    switch (selection) {
        case 1:
            addEmployee();
        break;
        case 2:
            findEmployeeId();
        break;
        case 3:
            findEmployeeName();
        break;
        case 4:
            deleteEmployee();
        break;
        case 5:
            displayStatistics();
        break;
        case 6:
            displayAllEmployees();
        break;
        case 7:
            importFromFile();
        break;
        case 8:
            exportToFile();
        break;
        case 9:
            cout<<"Thank you for using Employee Management System (EMS)"<<endl;
        break;
        default:
            while (!(selection >0 && selection <10)) {
                cout << "Invalid selection." << endl;
                cout << "Enter you selection (1..9):" << endl;
                std::cin.clear();// for the string case. It will loop without it.
                std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n'); // for the string case.
                cin >> selection;
                if (selection == 9) {
                    cout<<"Thank you for using Employee Management System (EMS)"<<endl;
                }
            }
    }
} while (selection != 9);

}
