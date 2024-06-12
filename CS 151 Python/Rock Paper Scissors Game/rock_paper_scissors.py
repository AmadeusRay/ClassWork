#meta info

#author: Arash Vasheghani
#date: June 10, 2024
#version: 1
# Is this a part of another program? No

#Python Paper Rock Scissors

#Pseudocode
#Create and return computer choice through a list and randomly choosing from the list (rock paper scissors) for for get_
# computer_choice
#Create and return user choice by asking "Paper, rock, or scissors: " for def get_user_choice
#Create and return who is the winner. Use if statements for the logic of what defeats what in paper rock scissors
# (assuming user will be winner in each if statement) and assigning the winner to user. Else is computer.

import random


def get_computer_choice():
    # Randomly selected between "rock", "paper", and "scissors" for the computer's choice
    choice_list = ["rock", "paper", "scissors"]  #the list we will randomly choose from
    return random.choice(choice_list)  #returns random choice from the choiceList


def get_user_choice():
    # Get the user's choice and convert it to lowercase
    user_choice: str = input("Paper, rock, or scissors: ")  # Asks for user input
    return user_choice  # returns user input


def determine_winner(user_choice, computer_choice):
    # Determine the winner based on the game rules

    # logic for who is the winner of paper rock scissors and assigning it to winner
    if user_choice == computer_choice:
        winner = "TIE"
    elif user_choice == "rock" and computer_choice == "scissors":
        winner = "User"
    elif user_choice == "paper" and computer_choice == "rock":
        winner = "User"
    elif user_choice == "scissors" and computer_choice == "paper":
        winner = "User"
    else:
        winner = "Computer"
    return winner


def main():
    print("Welcome to Rock Paper Scissors!")

    while True:
        # Get the user's choice
        user_choice = get_user_choice()

        # Check if the user wants to quit
        if user_choice == "quit":
            print("Thanks for playing! Goodbye!")
            break

        # Validate user input
        if user_choice not in ["rock", "paper", "scissors"]:
            print("Invalid choice! Please enter rock, paper, or scissors.")
            continue

        # Get the computer's choice
        computer_choice = get_computer_choice()
        print(f"Computer choice: {computer_choice}")

        # Determine and print the results
        result = determine_winner(user_choice, computer_choice)
        print(result)


if __name__ == "__main__":
    main()
