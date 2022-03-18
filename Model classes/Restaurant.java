import java.util.ArrayList;
import java.awt.Image;

/**
 * A simple Java class!
*/
public class Restaurant
{
    // Properties
    private String              name;
    private String              address;
    private ArrayList<Category> categories;
    
    // Constructors
    public Restaurant(String name, String address)
    {
        this.name = name;
        this.address = address;
        categories = new ArrayList<Category>();
    }
    
    // Methods
    //getters
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public ArrayList<Category> getCategories()
    {
        return categories;
    }
    
    //setters
    public void addCategory(String name)
    {
        categories.add(new Category(name));
    }
    
    public void addFood(ArrayList<String> ingredients, String name, Image image, int calories, int weight, int price, boolean gluten, boolean sugar, boolean lactose, boolean vegetarian, boolean vegan, String categoryName)
    {
        for(Category a: categories)
        {
            if(a.getName() == categoryName)
            {
                a.addDish(new Food(ingredients, name, image, calories, weight, price, gluten, sugar, lactose, vegetarian, vegan));
            }
        }
    }
}