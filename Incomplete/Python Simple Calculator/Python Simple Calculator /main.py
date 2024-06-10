def add(a, b):
    # add two numbers

def subtractr(a, b):
    # Subtract two numbers
    pass

def multiply(a, b):
    # Multiply two numbers
    pass

def divide(a, b):
    #Divide two numbers (handle division by zero)
    pass

def remainder(a, b):
    # Calculator the remainder of division (handle division by zero)

def get_numbers():
    # Prompt the user to enter two numbers and return them
    pass

def main():
    while True:
        #Display the menu options
    print("\Simple Calculator Menu")
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
        result = add(num1, num2)
        print(f"The result of {num1} + {num2} is {result}.")


