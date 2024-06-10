#Arash Vasheghani
#Module 4B
#CS/IS 151

# author: Arash Vasheghani
# date: March 19 2024.
# version: 1
# Is this a part of another program? No

while True:
    print("Arash Vasheghani's simple calculator")
    print("1. add")
    print("2. subtract")
    print("3. multiply")
    print("4. divide")
    print("5. exit")

    # Input of user's menu choice
    user_choice = input()

    # if it equals 5 then exit
    if user_choice == "5":
        break

    # define two variables for two numbers for math operations
    num1 = float(input("Enter 1st number: "))
    num2 = float(input("Enter 2nd number: "))
    # addition
    if user_choice == "1":
        result = num1 + num2
    # subtraction
    elif user_choice == "2":
        result = num1 - num2
    # multiplication
    elif user_choice == "3":
        result = num1 * num2
    # division
    elif user_choice == "4":
        result = num1 / num2

    print(f"{result}\n")

else:
    print("error")
