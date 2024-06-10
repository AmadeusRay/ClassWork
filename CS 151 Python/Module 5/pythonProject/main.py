#meta info

#author: Arash Vasheghani
#date: March 25, 2024
#version: 1
# Is this a part of another program? No

#Simple calculator
#for different functions are required addition, multiplication, division, and subtraction
#main function
#title, menu
#decision structure

# function for addition

def add_numbers(num1, num2):
      sum = num1 + num2
      return sum

#function for subtraction
def subtraction_numbers(num1, num2):
    return num1 - num2;

#fuction for multiplication
def multiplication_numbers(num1, num2):
    return num1 * num2;

#fuction for division
def division_numbers(num1, num2):
    return num1 / num2;

# defining main function

def main():
      print("Arash Vasheghani's simple calculator V1.0")
      print("----------------------------")

while True:

   # display menu items: 1. add 2. subtract 3. multiply 4. divide 5. quit
   print("1. add")
   print("2. subtraction")
   print("3. multiplication")
   print("4. division")
   print("5. quit")

   # receive your input and store it in memory
   user_input = input("Enter your choice: ")

   if user_input == "5":
       break #quit alternative. It's something.

   num1 = int(input("Enter 1st number: "))
   num2 = int(input("Enter 2nd number: "))

   if user_input == "1":

        result = add_numbers(num1, num2)
        print(f"The result is {result}\n")

   elif user_input == "2":

        result = subtraction_numbers(num1, num2)
        print(f"The result is {result}\n")

   elif user_input == "3":

       result = multiplication_numbers(num1, num2)
       print(f"The result is {result}\n")

   elif user_input == "4":

        result = division_numbers(num1, num2)
        print(f"The result is {result}\n")

   else:
       print("Invalid user input. Please try again.\n")

# call main function

if __name__ == "__main__":
    main()