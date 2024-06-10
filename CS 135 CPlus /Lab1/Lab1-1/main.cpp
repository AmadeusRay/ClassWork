/*
Arash Vasheghani
CS/IS 135
Lab #1. Roman Numeral Converter
 */
/*PSEUDOCODE
 I, II, III, IV, V, VI, VII, VIII, IX, and X

create int num
create string roman

 DISPLAY Please enter a number 1..10:
 INPUT num


switch(num)
 case 1 roman is I
 case 2 roman is II
 case 3 roman is III
 case 4 roman is IV
 case 5 roman is V
 case 6 roman is VI
 case 7 roman is VII
 case 8 roman is VIII
 case 9 roman is XI
 default Display That's not a valid number.

if num>=1 && num<=9
 DISPLAY The roman numeral for number is roman.
 */

#include <iostream>
using namespace std;

int main() {
 int num;
 string roman;
 cout<< "Please enter a number 1..10: "<< endl;
 cin>>num;

 switch(num) {
  case 1:
   roman = "I";
  break;
  case 2:
   roman = "II";
  break;
  case 3:
   roman = "III";
  break;
  case 4:
   roman = "IV";
  break;
  case 5:
   roman = "V";
  break;
  case 6:
   roman = "VI";
  break;
  case 7:
   roman = "VII";
  break;
  case 8:
   roman = "VIII";
  break;
  case 9:
   roman = "IX";
  break; // probably not needed ?
  default:
   cout<<"That's not a valid number."<<endl;
 }

 if (num>=1 && num<=9) {
  cout<<"The roman numeral for "<<num<<" is "<<roman<<"."<<endl;
 }
}





