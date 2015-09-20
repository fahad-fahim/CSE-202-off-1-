public class Author
{
    private String name;
    private String email;

    public Author()
    {

    }
    public Author(String str_name)
    {
        name=str_name;
    }
    public Author(String str_name, String str_email)
    {
        name=str_name;
        email=str_email;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String str_email)
    {
        email=str_email;
    }
    public void print()
    {
        System.out.println(name+"at"+email);
    }
}
