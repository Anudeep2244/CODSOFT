import random

def get_choice():
    choices = ["rock", "paper", "scissors"]
    while True:
        user_choice = input("\nEnter your choice [ rock, paper, scissors ]: ").lower().strip()
        if user_choice in choices:
            return user_choice, random.choice(choices)
        else:
            print("Invalid input. Please enter your choice correctly")

def get_continue_choice():
    while True:
        cont = input("Do you want to play again [yes/no]: ").lower().strip()
        if cont in ["yes", "no"]:
            return cont
        else:
            print("Invalid input. Please enter 'yes' or 'no'")

def print_result(user_choice, comp_choice, user_score, comp_score):
    if ((user_choice == 'rock' and comp_choice == 'scissors') or
        (user_choice == 'paper' and comp_choice == 'rock') or
        (user_choice == 'scissors' and comp_choice == 'paper')):
        print(f'User choice: {user_choice}, Computer choice: {comp_choice}')
        print("You win!")
        user_score += 1
    elif user_choice == comp_choice:
        print(f'User choice: {user_choice}, Computer choice: {comp_choice}')
        print("It's a draw!")
    else:
        print(f'User choice: {user_choice}, Computer choice: {comp_choice}')
        print("Computer wins!")
        comp_score += 1
    print(f'User score: {user_score}, Computer score: {comp_score}')
    return user_score, comp_score

if __name__ == "__main__":
    user_score, comp_score = 0, 0   
    print("***** Rock, Paper, Scissors Game *****")
    while True:
        user_choice, comp_choice = get_choice()
        user_score, comp_score = print_result(user_choice, comp_choice, user_score, comp_score)
        cont = get_continue_choice()
        if cont == 'no':
            print(f'\nFinal scores : user => {user_score} , computer => {comp_score}')
            print("Thanks for playing!\n")
            break
