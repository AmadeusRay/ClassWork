/*
* Arash Vasheghani
 * CS/IS 137-1049
 * Assignment 1a
 */

#include <iostream>
#include <iomanip>

using namespace std;

class Inventory {
private:
    int itemNumber;
    int quantity;
    double cost;
    double totalCost;

public:
    Inventory() : itemNumber(), quantity(0), cost(0), totalCost(0) {}

    Inventory(int items, int amount, double price) {
        itemNumber = items;
        quantity = amount;
        cost = price;

        setTotalCost(quantity,cost);
    }

    void setItemNumber(int i) {
        if (i<0) {
            do {
                cout<<"Item number can't be less than zero, try again:"<<endl;
                cin>>i;
            }
            while (i<0);
        }
        itemNumber = i;
    }

    void setQuantity(int q) {
        if (q<0) {
            do {
                cout<<"Item quantity can't be less than zero, try again:"<<endl;
                cin>>q;
            }
            while (q<0);
        }
        quantity = q;
    }

    void setCost (double c) {
        if (c<0) {
            do {
                cout<<"Item cost can't be less than zero, try again:"<<endl;
                cin>>c;
            }
            while (c<0);
        }
        cost = c;
    }

    void setTotalCost(int q, double c){
        totalCost = q * c;
    }

    int getItemNumber() const{
        return itemNumber;
    }

    int get_Quantity() const {
        return quantity;
    }

    void displayAll()  const{
        cout<<"Item Number: "<<itemNumber<<endl;
        cout<<"Quantity: "<<quantity<<endl;
        cout<< fixed << setprecision(2);
        cout<<"Cost: $"<<cost<<endl;
        cout<<"Total Cost: $"<<totalCost<<endl;
        cout<<endl;
    }

    ~Inventory() {};
};

int main()
{
    int tempID;
    int tempQuantity;
    double tempCost;

    Inventory apples;
    Inventory oranges;
    Inventory spinach;

    cout<<"Current Inventory data for apples:"<<endl;
    apples.displayAll();
    cout<<"Current Inventory data for oranges:"<<endl;
    oranges.displayAll();
    cout<<"Current Inventory data for spinach:"<<endl;
    spinach.displayAll();

    cout<<"Set ID number for oranges:"<<endl;
    cin>>tempID;
    oranges.setItemNumber (tempID);

    cout<<"Set quantity for oranges:"<<endl;
    cin>>tempQuantity;
    oranges.setQuantity(tempQuantity);

    cout<<"Set cost for oranges:"<<endl;
    cin>>tempCost;
    oranges.setCost(tempCost);

    oranges.setTotalCost(tempQuantity,tempCost);

    oranges.displayAll();
}
