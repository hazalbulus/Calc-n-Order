import javax.swing.*;

/**
 * Game and test class for memory game
 * @author boran
 * @version 25.07.2021
 */
public class PlayMemoryGame 
{
    public static void main( String[] args)
    {
        MemoryGame potluck = new MemoryGame();
        potluck.setTitle("Hungry People's Memory Game");
        potluck.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        potluck.setSize(600,600);
        potluck.setVisible(true);
    }
}
