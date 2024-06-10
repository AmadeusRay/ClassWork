# meta info

# author: Arash Vasheghani
# date: Monday April 1 2024
# version: V2
# Is this a part of another program? Yes. V1 calculator now with file operations

# pseudocode
# add back functionality from the previous calculator project to V2.
# such as def for all mathematical functions with returning result
# ---- I add a def when project was done for file operations to avoid repetitive code. It will print and save result,
# and close file (loop back to user input will open file again)
# display announcement of calculator (outside of while true) and math menu options (while true)
# user input choice based on menu options
# open the result.txt, append (doing this at the beginning of the loop). I'm assuming when loops back to menu then,
# after input it opens the file again after a completed calculation
# if & else if statements including each corresponding math menu option (add, subtract, etc., and quit)
# for each math operation option, display / input for 1st number and 2nd number and call math_result

# validation check (none menu selection) for user input


# function for addition

def add_numbers(num1, num2):
    return num1 + num2


# function for subtraction
def subtract_numbers(num1, num2):
    return num1 - num2


# function for multiplication
def multiply_numbers(num1, num2):
    return num1 * num2


# function for division
def divide_numbers(num1, num2):
    return num1 / num2


def math_result(result):          #prints result and saves result
    print(f"The result is {result}\n")
    infile.write(f"The result is {result}\n")
    infile.close()


# defining main function

def main():
    print("Arash Vasheghani simple calculator V2.0")
    print("----------------------------")


while True:

    # display menu items: 1. add 2. subtract 3. multiply 4. divide 5. quit
    print("1. add")
    print("2. subtract")
    print("3. multiply")
    print("4. divide")
    print("5. quit")

    # receive your input and store it in memory

    user_input = input("Enter your choice: ")
    infile = open("result.txt", 'a')

    if user_input == "1":
        num1 = int(input("Enter 1st number: "))
        num2 = int(input("Enter 2nd number: "))
        result = add_numbers(num1, num2)
        math_result(result)

    elif user_input == "2":
        num1 = int(input("Enter 1st number: "))
        num2 = int(input("Enter 2nd number: "))
        result = subtract_numbers(num1, num2)
        math_result(result)

    elif user_input == "3":
        num1 = int(input("Enter 1st number: "))
        num2 = int(input("Enter 2nd number: "))
        result = multiply_numbers(num1, num2)
        math_result(result)

    elif user_input == "4":
        num1 = int(input("Enter 1st number: "))
        num2 = int(input("Enter 2nd number: "))
        result = divide_numbers(num1, num2)
        math_result(result)

    elif user_input == "5":
        quit()

    else:
        print("Invalid user input. Please try again.\n")

# call main function I HAVE no clue what this does and why it's in the assignment. I know what a main function is but
# this is different to me

if __name__ == "__main__":
    main()
