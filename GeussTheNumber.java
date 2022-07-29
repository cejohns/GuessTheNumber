
import java.util.Scanner;

public class GFG {

    // Function that implements the
    // number guessing game
    public static void
    guessingNumberGame()
    {
        // Scanner Class
        Scanner sc = new Scanner(System.in);

        // Generate the numbers
        int number = 1 + (int)(20
                * Math.random());

        // Given K trials
        int K = 10;
        String name = " ";

        int i, guess;

        System.out.println( "Hello, what is your name?");
        name = sc.next();

        System.out.println( "Well" + name + "I am thinking of a number between 1 and 20");

        // Iterate over K Trials
        for (i = 0; i < K; i++) {

            System.out.println(
                    "Guess the number:");

            // Take input for guessing
            guess = sc.nextInt();

            // If the number is guessed
            if (number == guess) {
                System.out.println("Good job"+ name + " You guessed my number in"  + i + "guess!");
                break;
                System.out.println("Would you like to play agian?(y or n)");
                if(name == "y")
                {
                    //play again
                    number = 1 + (int)(100
                            * Math.random());
                    K=1;
                }
                else if (name == "n")
                {
                    System.exit(0);
                }
            }
            else if (number > guess
                    && i != K - 1) {
                System.out.println(
                        "The number is "
                                + "greater than " + guess);
            }
            else if (number < guess
                    && i != K - 1) {
                System.out.println(
                        "The number is"
                                + " less than " + guess);
            }
        }

        if (i == K) {
            System.out.println(
                    "You have exhaustedall your attempts.");

            System.out.println(
                    "The number was " + number);
        }
    }

    // Driver Code
    public static void
    main(String arg[])
    {

        // Function Call
        guessingNumberGame();
    }
}


public class GeussTheNumber {

    // Function that implements the
    // number guessing game
    public static void guessingNumberGame()
    {
        // Scanner Class
        Scanner sc = new Scanner(System.in);

        // Generate the numbers
        int number = 1 + (int)(100
                * Math.random());
        String name = " ";

        // Given K trials
        int K = 1;

        int guess;

        System.out.println( "Hello, what is your name?");
        name = sc.next();

        System.out.println( "Well" + name + "I am thinking of a number between 1 and 20");






            // Take input for guessing
            guess = sc.nextInt();

            // If the number is guessed
            if (number == guess) {
                System.out.println("Good job"+ name + " You guessed my number in" + K + "guess!"");
                break;
                System.out.println("Would you like to play agian?(y or n)");
                if(name == "y")
                {
                    //play again
                    number = 1 + (int)(100
                            * Math.random());
                    k=1;
                }
                else if (name == "n")
                {
                    System.exit(0);
                }

            }
            else if (number > guess) {
                System.out.println("The number is  too high, Take a guess.");
                K++;
            }
            else if (number < guess) {
                System.out.println("The number is  too low, Take a guess.");
                K++;
            }
        }



    }

    // Driver Code
    public static void
    main(String arg[])
    {

        // Function Call
        guessingNumberGame();
    }
}
}
