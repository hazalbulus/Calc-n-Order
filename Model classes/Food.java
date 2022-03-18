import java.util.ArrayList;
import java.awt.Image;

/**
 * A simple Java class!
*/
public class Food
{
    // Properties
    private ArrayList<String> ingredients;
    private ArrayList<Integer> ratings;
    private Image   photo;
    private String  name;
    private int     weight;
    private int     calories;
    private int     price;
    private double  rating;
    private boolean isGlutenFree;
    private boolean isSugarFree;
    private boolean isLactoseFree;
    private boolean isVegeterian;
    private boolean isVegan;
    
    // Constructors
    public Food(ArrayList<String> ingredients, String name, Image image, int calories, int weight, int price, boolean gluten, boolean sugar, boolean lactose, boolean vegetarian, boolean vegan)
    {
        ratings = new ArrayList<Integer>();
        this.ingredients = ingredients;
        this.name = name;
        this.calories = calories;
        this.weight = weight;
        this.price = price;
        photo = image;
        isGlutenFree =  gluten;
        isSugarFree =   sugar;
        isLactoseFree = lactose;
        isVegeterian =  vegetarian;
        isVegan =       vegan;
    }
    
    // Methods
    //getters
    public String getName()
    {
        return name;
    }
    
    public Image getPhoto()
    {
        return photo;
    }
    
    public int getWeight()
    {
        return weight;
    }
    
    public int getCalories()
    {
        return calories;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public double getRating()
    {
        return rating;
    }
    
    public boolean getLactoseFree()
    {
        return isLactoseFree;
    }
    
    public boolean getSugerFree()
    {
        return isSugarFree;
    }
    
    public boolean getGlutenFree()
    {
        return isGlutenFree;
    }
    
    public boolean getVegetarian()
    {
        return isVegeterian;
    }
    
    public boolean getVegan()
    {
        return isVegan;
    }
    
    public ArrayList<String> getIngredients()
    {
        return ingredients;
    }
    
    //setters
    public void setRating()
    {
        int result = 0;
        for(int a: ratings)
        {
            result = result + a;
        }
        rating = result / (ratings.size());
    }
    
    //methods
    public void addRating(int rating)
    {
        ratings.add(rating);
    }
}