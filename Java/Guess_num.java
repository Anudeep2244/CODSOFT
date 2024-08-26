<<<<<<< HEAD
import java.util.*;

public class Guess_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int total_rounds = 0;
        int total_attempts = 0;
        int wins = 0;
        boolean play_again = true;
        final int max_attempts = 10;

        System.out.println("*** Number Guessing Game ***");
        System.out.println("Let's see if you can guess the number.");
        System.out.println("You'll only get " + max_attempts + " attempts to guess the number.");


        while (play_again) {
            int num_to_guess = random.nextInt(1,101);
            int attempt_number = 1;
            boolean guess = false;

            while (attempt_number <= max_attempts &&  !guess) { 
                System.out.print("\nEnter your guess : ");
                int user_guess = scanner.nextInt();

                if (user_guess > num_to_guess) {
                    System.out.println("It's high! Try again.");
                }
                else if (user_guess < num_to_guess) {
                    System.out.println("It's low! Try again.");
                } 
                else {
                    System.out.println("Yeahh! You guessed it right in just " + attempt_number + " attempts.");
                    wins++;
                    guess = true;
                    break;
                }
                attempt_number++;
            }
            total_rounds++;
            total_attempts += attempt_number;

            if (!guess) {
                System.out.println("Sorry, you've used all your attempts. The number was: " + num_to_guess);
            }

            System.out.println("\nRound summary: ");
            System.out.println("Total rounds played: " + total_rounds);
            System.out.println("Rounds won: " + wins);
            System.out.println("Total attempts so far: " + total_attempts);

            System.out.println("\nYou wanna play again ? [yes / no] : ");
            String ch = scanner.next().toLowerCase().strip();
            
            play_again = ch.equals("yes");  
        }
        System.out.println("\nThankyou for playing.");
        System.out.println("Total rounds played : " + total_rounds);
        System.out.println("Total attempts : " + total_attempts);
        System.out.println("Rounds won: " + wins);

        scanner.close();
    }
}
=======
import java.util.*;

public class Guess_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int total_rounds = 0;
        int total_attempts = 0;
        int wins = 0;
        boolean play_again = true;
        final int max_attempts = 10;

        System.out.println("*** Number Guessing Game ***");
        System.out.println("Let's see if you can guess the number.");
        System.out.println("You'll only get " + max_attempts + " attempts to guess the number.");


        while (play_again) {
            int num_to_guess = random.nextInt(1,101);
            int attempt_number = 1;
            boolean guess = false;

            while (attempt_number <= max_attempts &&  !guess) { 
                System.out.print("\nEnter your guess : ");
                int user_guess = scanner.nextInt();

                if (user_guess > num_to_guess) {
                    System.out.println("It's high! Try again.");
                }
                else if (user_guess < num_to_guess) {
                    System.out.println("It's low! Try again.");
                } 
                else {
                    System.out.println("Yeahh! You guessed it right in just " + attempt_number + " attempts.");
                    wins++;
                    guess = true;
                    break;
                }
                attempt_number++;
            }
            total_rounds++;
            total_attempts += attempt_number;

            if (!guess) {
                System.out.println("Sorry, you've used all your attempts. The number was: " + num_to_guess);
            }

            System.out.println("\nRound summary: ");
            System.out.println("Total rounds played: " + total_rounds);
            System.out.println("Rounds won: " + wins);
            System.out.println("Total attempts so far: " + total_attempts);

            System.out.println("\nYou wanna play again ? [yes / no] : ");
            String ch = scanner.next().toLowerCase().strip();
            
            play_again = ch.equals("yes");  
        }
        System.out.println("\nThankyou for playing.");
        System.out.println("Total rounds played : " + total_rounds);
        System.out.println("Total attempts : " + total_attempts);
        System.out.println("Rounds won: " + wins);

        scanner.close();
    }
}
>>>>>>> d674ba3ea9910aef78f10bfbb85a6c896ddc612f
