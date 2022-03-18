import java.util.Scanner;

/**
 * This class is tester and player class for hanghungryman game.
 * @author boran
 * @version 1.0 25.07.2021
 */ 
public class PlayHangHungryMan
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Constants
        final String SPLIT = "----------------------------";
        final String BLANK_LINE = ""; // this may seem unnecessary, but since I used couple times I decided to set it as a constant

        // Variables
        String letter;
        String state;
        int letterOccurance;
        boolean playAgain;
        HangHungryMan game;
 
        // Program code
        playAgain = true; // initialize playAgain to start the game

        while (playAgain) 
        {
            game = new HangHungryMan(); // create the game
            System.out.println();
            System.out.println( "Welcome to the hangman game."); // Print welcome message
            System.out.println("Are we hungry enough??????");
            System.out.println( SPLIT);

            // Do these things until game is over
            do
            {
                // Inform user about their prediction quantity
                System.out.println( "You have " + (game.getMaxAllowedIncorrectTries() - game.getNumOfIncorrectTries()) + " wrong prediction chance before you lose the game.");
                System.out.println( "Letters that you used so far: " + game.getUsedLetters()); // Inform about letters that user used
                System.out.println( "Letters that can be entered: " + game.getAllLetters());
                System.out.println( "Word so far: " + game.getKnownSoFar()); // Word so far
                System.out.println( "Please enter a letter: "); // Ask & get for the letter
                letter = scan.next();
                letterOccurance = game.tryThis(letter.charAt(0)); // try the letter in tryThis method

                
                if ( letter.length() != 1)
                {
                    System.out.println(BLANK_LINE);
                    System.out.println( "Please enter one letter!");
                }
                else 
                {
                    // If occurance of leter is -1 that means user didn't enter a valid character
                    if(letterOccurance == -1)
                    {
                        System.out.println("Please enter a valid character");
                    }
                    else
                    {
                        if ( letterOccurance == -3 )
                        {
                            System.out.println( BLANK_LINE);
                            System.out.println( "Game is over");
                        }
                        else if ( letterOccurance == -2 )
                        {
                            System.out.println( BLANK_LINE);
                            System.out.println( "You entered this letter already! Can you enter a new one?");
                        }
                        else if ( letterOccurance == 0 ) 
                        {
                            System.out.println( BLANK_LINE);
                            System.out.println( "Wrong guess. The letter you entered is not in the secret word");
                        }
                        else 
                        {
                            System.out.println( BLANK_LINE);
                            System.out.println( "Correct guess. The letter you entered is in the secret word");
                        }   
                    }
                }

            } while (!game.isGameOver());

            if (game.hasLost())
            {
                System.out.println( "Sorry, but you lost the game."); // if user losts the game print sorry message
            }
            else if (!game.hasLost())
            {
                System.out.println( "Congrats, you won the game."); // if user wins the game print congrulation message
            }
            
            System.out.println( "Secret word was, " + game.secretWord); // this is problematic you can delete this if you want
            System.out.println( "Do you want to play again?" + "\n" + "If yes, enter \"y\"");
            state = scan.next();
            if( state.equalsIgnoreCase("y"))
            {
                continue; // I do not know really what continue statement is, but this was in HangmanMainMethod2.txt. It works.
            }
            else
            {
                playAgain = false;
                System.out.println( "Goodbye! We hope we can see you soon."); // Print goodbye message
            }
        }
        scan.close();
    }
}

