#meta info

#author: Arash Vasheghani
#date: June 10, 2024
#version: 1
# Is this a part of another program? No

#Python Simple Calculator Extra Credit (doing it just for experience after due date)

# For each math definition, return the desired result by putting the math formula in as the return using the input values
# For get_numbers ask assign each number (two of them) to a variable while asking the user for their input.
# Then return each variable (num1, num2)


def add(a, b):
    # add two numbers
    return (a + b) # returns the result

def subtract(a, b):
    # subtract two numbers
    return (a - b)

def multiply(a, b):
    # multiply two numbers
    return (a * b)


def divide(a, b):
    # divide two numbers
    return (a / b)


def remainder(a, b):
    # the remainder of two numbers
    return (a % b)


def get_numbers():
    # Prompt the user to enter two numbers and return them
  while True: # loop it until input is numbers
    num1 = input("Enter 1st number: ") # Asks for user input for the first number and assigning it to num1
    num2 = input("Enter 2nd number: ") # Asks for user input for the second number and assigning it to num2
    try:
        num1 = int(num1) # checking if num1 is int
        num2 = int(num2) # checking if num2 is int
    except ValueError:   # if they are not int
        print("Invalid input. Try again by putting two numbers and not a String or Char")
   # returning both num1 and num2 to suit parameters of math definitions

def main():
    while True:
        # Display the menu options
        print("\nSimple Calculator Menu")
        print("1. Add")
        print("2. Subtract")
        print("3. Multiply")
        print("4. Divide")
        print("5. Calculate Remainder")
        print("6. Quit")

        #Get user's choice
        choice = input("Choose an option (1-6): ")

        if choice == '1':
            num1, num2 = get_numbers()
            result = add(num1, num2)
            print(f"The result of {num1} + {num2} is {result}.")

        elif choice == '2':
            num1, num2 = get_numbers()
            result = subtract(num1, num2)
            print(f"The result of {num1} - {num2} is {result}.")

        elif choice == '3':
            num1, num2 = get_numbers()
            result = multiply(num1, num2)
            print(f"The result of {num1} * {num2} is {result}.")

        elif choice == '4':
            num1, num2 = get_numbers()
            result = divide(num1, num2)
            print(f"The result of {num1} / {num2} is {result}.")

        elif choice == '5':
            num1, num2 = get_numbers()
            result = remainder(num1, num2)
            print(f"The result of {num1} % {num2} is {result}.")

        elif choice == '6':
            print("Quiting the calculator. Goodbye!")
            break

        else:
            print("Invalid choice! Please choose a valid option.")


if __name__ == '__main__':
    main()
