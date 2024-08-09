def compute(n1, n2, op):
    return n1+n2 if op == '+' else n1-n2 if op == '-' else n1*n2 if op == "*" else n1/n2

if __name__ == "__main__":
    print("***** Simple Calculator *****")
    
    while True:
        num_1 = input("\nEnter your first variable : ")
        num_2 = input("Enter your second variable : ")
        op_choice = input("Enter the operation you wanna perform [+ , - , * , /]: ")

        if num_1.replace(".","",1).isdigit() and num_2.replace(".","",1).isdigit() and op_choice in ['+','-','*','/']:
            res = compute(float(num_1), float(num_2), op_choice)
            print(f'{num_1} {op_choice} {num_2} = {res}')
            cont = input("You wanna do more operations? [yes/no] : ").lower()

            if cont == 'yes':
                continue
            else :
                exit("thankyou!!!")
        else:
            print("Invalid input. Please ensure you enter valid operators and operands.")
            continue