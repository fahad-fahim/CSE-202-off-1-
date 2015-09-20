public class Author
{
    private String name;
    private String email;

    public Author()
    {

    }
    public Author(String name1)
    {
        name=name1;
    }
    public Author(String name1, String email1)
    {
        name=name1;
        email=email1;
    }
    public void print()
    {
        System.out.println(name+"at"+email);
    }
    public String getEmail()
    {
        return email;
    }
    public String getName()
    {
        return name;
    }
    public void setEmail(String email1)
    {
        email=email1;
    }
}
