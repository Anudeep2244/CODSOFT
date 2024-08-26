import java.util.Scanner;

class ATMSystem {
    private float balance;

    public ATMSystem(){
        balance = 0;
    }

    public void deposit(float amount){
        balance += amount;
        System.out.println("Deposit successful.");
    }

    public void withdraw(float amount){
        if (amount > balance){
            System.out.println("Insufficient Balance.");
        } 
        else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    public void showBalance(){
        System.out.println("Balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        ATMSystem user = new ATMSystem();
        Scanner scanner = new Scanner(System.in);
        int ch;
        float amount;
        do { 
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your option: ");
            ch = scanner.nextInt();

            switch (ch) {
                case 1: 
                    System.out.print("Enter the amount you want to deposit: ");
                    amount = scanner.nextFloat();
                    if (amount > 0){
                        user.deposit(amount);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;
                
                case 2: 
                    System.out.print("Enter the amount you want to withdraw: ");
                    amount = scanner.nextFloat();
                    if (amount > 0) {
                        user.withdraw(amount);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;
                
                case 3: 
                    user.showBalance();
                    break;

                case 4: 
                    System.out.println("Thank you for using the ATM!");
                    break;
                
                default: 
                    System.out.println("Invalid input, please try again.");
            }
        } while (ch != 4);
        scanner.close();
    }
}
