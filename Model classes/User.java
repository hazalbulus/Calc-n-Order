/**
 * A simple java class!
*/
public class User
{
    // Properties
    private String name;
    private String surname;
    private String dateOfBirth;
    private String eMail;
    private String address;
    private int    phoneNumber;
    
    // Constructors
    public User(String name, String surname, String dateOfBirth, String eMail, String address, int phoneNumber)
    {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.eMail = eMail;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    // Methods
    public String getName()
    {
        return name;
    }
    
    public String getSurname()
    {
        return surname;
    }
    
    public String getFullName()
    {
        return name + " " + surname;
    }
    public String getAdress()
    {
        return address;
    }
    
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
    
    public String getEmail()
    {
        return eMail;
    }
    
    public int getPhoneNumber()
    {
        return phoneNumber;
    }
}