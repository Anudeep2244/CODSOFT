import random
upper = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
lower = upper.lower()
num = '1234567890'
special = "!@#$%^&*()_-+={[]}|;:',.<>?/"
choices = upper+lower+num+special
while True:
    length = input("\nEnter your desired length for your password : ")
    if length.isdigit():
        length = int(length)
        if length >= 1:
            password = "".join(random.choice(choices) for _ in range(length))
            print(f"Here is your password : {password}")
            while True:
                like = input("Would you like to generate another? [yes/no] : ").lower()
                if like not in ['yes','no']:
                    print("Invalid option, please enter 'yes' or 'no'. ")
                    continue
                if like == "yes":
                    break
                else:
                    exit("Thankyou!")
            continue
        else :
            print("Invalid length. Please enter a length greater than 0")
    else :
        print("Invalid input, please enter a valid number")