import random

def get_computer_choice():
    # Randomly selected between "rock", "paper", and "scissors" for the computer's choice
    choiceList = ["rock", "paper", "scissors"]
    return random.choice(choiceList)


def get_user_choice():
    # Get the user's choice and convert it to lowercase
    userChoice = input("Paper, rock, or scissors: ")  # Asks for user input for the second number and
    return userChoice

def determine_winner(user_choice, computer_choice):
    # Determine the winner based on the game rules
    choices = [user_choice + computer_choice]

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
