public class Book
{
    private String name;
    private Author author;
    private double price;
    private int stock;

    public Book(String Name,Author aauthor)
    {
        name=Name;
        author=aauthor;
    }
    public Book(String Name,Author aauthor, double Price, int Stock)
    {
        name=Name;
        author=aauthor;
        price=Price;
        stock=Stock;
    }
    public void setPrice(double Price)
    {
        price=Price;
    }
    public void setStock(int Stock)
    {
        stock=Stock;
    }
    public void borrowBook(int Stock)
    {
        if(Stock>stock){
            System.out.println("Borrowing amount exceeds the current stock!");
        }
        else stock-=Stock;
    }
    public void returnBook(int Stock){
        stock+=Stock;
    }
    public String getAuthorName()
    {
        return author.getName();
    }
    public String getName()
    {
        return name;
    }
    public int getStock()
    {
        return stock;
    }
    public double getPrice()
    {
        return price;
    }
    public void print()
    {
        System.out.println("Author: "+author.getName()+" Name: "+name+" Price: "+price+" Stock: "+stock);
    }
    public Author getAuthor()
    {
        return author;
    }
}
