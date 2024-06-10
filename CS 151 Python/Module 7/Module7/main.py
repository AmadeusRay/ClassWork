# meta info

# author: Arash Vasheghani
# date: Aprl 7, 2024
# version: Version 3.0
# Is this a part of another program? Yes, this is the third version of the calculator program
# utilizing exception handling

# pseudocode: add input validation for the menu choices.

# Create a new list to define the math operations
operations = ["+", "-", "*", "/"]


def main():
    while True:
        # Display the main menu
        print("Arash Vasheghani calculator")
        print("--------------------")
        print("1: Addition")
        print("2: Subtraction")
        print("3: Multiplication")
        print("4: Division")
        print("q: Quit")

        # Ask the user for a choice
        choice = input("Enter your choice:")

        # Check if the user wants to exit the program
        if choice == "q":
            break

        # Create a new list to check user input
        if choice in ["1", "2", "3", "4"]:
            # Display the sub-menu for the selected operation
            if choice == "1":
                operation = "+"
                operation_name = "Addition"
            elif choice == "2":
                operation = "-"
                operation_name = "Subtraction"
            elif choice == "3":
                operation = "*"
                operation_name = "Multiplication"
            elif choice == "4":
                operation = "/"
                operation_name = "Division"

            print(f"\n{operation_name}:")
            print("1: Enter numbers")
            print("q: Return to main menu")

            # Ask the user for a sub-choice
            sub_choice = input("Please enter your choice: ")

            # Check if the user wants to return to the main menu
            if sub_choice.lower() == "q":
                continue

            # Check if the sub-choice is valid
            if sub_choice == "1":
                # Ask the user for two numbers
                num1 = float(input("Enter the 1st number: "))
                num2 = float(input("Enter the 2nd number: "))

                # Perform the selected operation
                if operation == "+":
                    result = num1 + num2
                elif operation == "-":
                    result = num1 - num2
                elif operation == "*":
                    result = num1 * num2
                elif operation == "/":
                    # Check if the second number is not zero
                    if num2 != 0:
                        result = num1 / num2
                    else:
                        print("Error: cannot divide with zero!!")
                        continue

                # Print the result
                print(f"{num1} {operation} {num2} = {result}\n")
            else:
                print("Error: invalid sub-choice\n")
        else:
            print("Error: invalid choice\n")


if __name__ == "__main__":
    main()
