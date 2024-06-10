#Arash Vasheghani
#Module 4A
#CS/IS 151


# author: Arash Vasheghani
# date: March 24 2024
# version: 1
# Is this a part of another program? No.


# display hello message and ask user's name

print("I am your virtual assistant, Jeanie what is your name?")

# declare a variable for user input as string

user_name = input("What is your name? ")

# display user's name with welcome message and ask for user's age

print(f"Nice to meet you, {user_name}! How old are you?")

# declare a variable for user input as integer
user_age = int(input("What is your age? "))  #explicit with int because IDE was expecting string

# if the user is over 18 display that they are authorized
if user_age >= 18:
    print("You are authorized to use the service.\n")

# if the user is under 18 display that they are not authorized
else:
    print("You are not authorized to use the service due to age restrictions.\n")