import javax.swing.*;

/**
 * Game and test class for foodluck
 * @author boran
 * @version 25.07.2021
 */
public class PlayFoodLuck
{
    public static void main( String[] args)
    {
        FoodLuck potluck = new FoodLuck();
        potluck.setTitle("Hungry People's FoodLuck Game");
        potluck.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        potluck.setSize(600,600);
        potluck.setVisible(true);
    }
}
