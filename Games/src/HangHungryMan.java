/**
 * This class contains methods, properties and constructors for main method
 * @author boran
 * @version 1.0 25.07.2021
 */

public class HangHungryMan  
{
    // properties
    public StringBuffer secretWord; // I made it public in order to print if user cannot find the secret word when game is over
    private StringBuffer allLetters;
    private StringBuffer usedLetters;
    private int numberOfIncorrectTries;
    private int maxAllowedIncorrectTries;
    private StringBuffer knownSoFar;
    private String[] wordList = { "burger", "pizza", "salad", "steak", "ketchup", "mayonnaise", "meat", "kebab", "fries", "chicken"};
    
    // constructors
    public HangHungryMan()
    {
        // set max incorrect tries to 6
        maxAllowedIncorrectTries = 6;
        
        // set number of incorrect tries to 0 at the beginning of the game
        numberOfIncorrectTries = 0;
        
        // choose secret word for the game
        chooseSecretWord();
        
        // English alphabet
        allLetters = new StringBuffer ("abcdefghijklmnopqrstuvwxyz");
        
        usedLetters = new StringBuffer ();
        
        knownSoFar = new StringBuffer(); 
        for ( int i = 0; i < secretWord.length(); i++)
        {
            knownSoFar.append("*");
        }
    }
    
    // methods
    
    /**
     * Getter method for all letters
     * @return allLetters.toString()
     */ 
    public String getAllLetters()
    {
        return allLetters.toString();
    }
    
    /**
     * Getter method for used letters
     * @return usedLetters.toString()
     */ 
    public String getUsedLetters()
    {
        return usedLetters.toString();
    }
    
    /**
     * Getter method for number of incorrect tries
     * @return numberOfIncorrectTries
     */ 
    public int getNumOfIncorrectTries()
    {
        return numberOfIncorrectTries;
    }
    
    /**
     * Getter method for maximum allowed incorrect tries
     * @return maxAllowedIncorrectTries
     */ 
    public int getMaxAllowedIncorrectTries()
    {
        return maxAllowedIncorrectTries;
    }
    
    /**
     * Getter method for part of the word which is known
     * @return knownSoFar.toString()
     */ 
    public String getKnownSoFar()
    {
        return knownSoFar.toString();
    }
    
    /**
     * If user reaches maximum allowed incorrect tries user losts the game
     */
    public boolean hasLost()
    {
        if (numberOfIncorrectTries >= maxAllowedIncorrectTries)
            return true;
        else
            return false;
    }
    
    /**
     * If user losts the game or finds the secret word game is over
     */
    public boolean isGameOver()
    {
        return (this.hasLost() || knownSoFar.toString().equals( this.secretWord.toString()));
    }
    
    /**
     * This method is taken from TryThis2.txt (which is provided by our instructor) and modified in terms of needings by me
     */ 
    public int tryThis( char letter) 
    {
        int occurences;
        // checks if char is valid or not
        if( allLetters.indexOf(letter+"") == -1 ) {
            return -1;
        }
        else {
            // checks if char is used before 
            if( usedLetters.indexOf(letter+"") == -1) 
            {
                occurences = 0;
                for( int i = 0; i < this.secretWord.length(); i++ ) 
                {
                    if( letter == this.secretWord.charAt(i) ) 
                    {
                        occurences++;
                        knownSoFar.replace(i, i+1, letter+""); //updates knownSoFar
                    }
                }
                usedLetters.append(letter);
                // updates numberOfIncorrectTries if char is not included in secretWord
                if( occurences == 0 ) 
                {
                    numberOfIncorrectTries++;
                }
                if( isGameOver() )
                {
                    return -3;
                }
        
                return occurences;
            }
            else
            {
                return -2; // if letter is used before
            }
        }
    }
    
    /**
     * Choose one word randomly from fixed list
     */ 
    private void chooseSecretWord()
    {
        int randomNumber;
        randomNumber = (int) Math.floor(wordList.length * Math.random());
        secretWord = new StringBuffer (wordList[randomNumber]);
    }
}

