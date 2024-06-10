/*
Arash Vasheghani
CS/IS 135
Final Exam - Hypergrade project
 */

#include <iostream>
#include <vector>
#include <fstream>
#include <iomanip>

using namespace std;

int main() {
    string fileName;

    vector<vector<double>> data;
    vector<double> row;
    double num;
    char ch;

    cout << "Enter the file name:\n";
    cin >> fileName;

    //validation check and repeat (if invalid)
    ifstream inputFile(fileName);
    do {
        if (!inputFile) {
            cerr << "Reading file error\n" << fileName;
            cout << "Enter the file name:\n";
            cin >> fileName;
            ifstream inputFile(fileName);
        }
    }while(!inputFile);

    while (inputFile >> num) {
        row.push_back(num);
        ch = inputFile.get();
        if (inputFile.eof() || ch == '\n') {
            data.push_back(row);
            row.clear();
        }
    }
    inputFile.close();

    //row subtotals
    vector<double> rowSums(data.size(), 0.0);
    for (size_t i = 0; i < data.size(); ++i) {
        for (size_t j = 0; j < data[i].size(); ++j) {
            rowSums[i] += data[i][j];
        }
    }

    //column subtotals
    size_t maxCols = 0;
    for (const auto& row : data) {
        if (row.size() > maxCols) {
            maxCols = row.size();
        }
    }

    vector<double> colSums(maxCols, 0.0);
    for (size_t i = 0; i < data.size(); ++i) {
        for (size_t j = 0; j < data[i].size(); ++j) {
            colSums[j] += data[i][j];
        }
    }

    //total sum
    double totalSum = 0.0;
    for (const auto& sum : rowSums) {
        totalSum += sum;
    }

    //printing
    cout << fixed << setprecision(2);
    for (size_t i = 0; i < rowSums.size(); ++i) {
        cout << "Row " << i << " Subtotal: " << rowSums[i] << endl;
    }

    for (size_t j = 0; j < colSums.size(); ++j) {
        cout << "Column " << j << " Subtotal: " << colSums[j] << endl;
    }

    //print totalSum, checking if it's a whole number
    cout << "Total: "<<totalSum<<"\n";

    //Test case for hypergrade changed in the middle of the exam.
    // if (totalSum == static_cast<int>(totalSum)) {
    //     cout << static_cast<int>(totalSum) << endl;
    // } else {
    //     cout << totalSum << endl;
    // }

    return 0;
}