public class Book
{
    private String name;
    private Author author;
    private double price;
    private int stock;

    public Book(String name1,Author author1)
    {
        name=name1;
        author=author1;
    }
    public Book(String name1,Author author1, double price1, int stock1)
    {
        name=name1;
        author=author1;
        price=price1;
        stock=stock1;
    }
    public void setPrice(double price1)
    {
        price=price1;
    }
    public void setStock(int stock1)
    {
        stock=stock1;
    }
    public void borrowBook(int stock1)
    {
        if(stock1>stock){
            System.out.println("Borrowing amount exceeds the current stock!");
        }
        else stock-=stock1;
    }
    public void returnBook(int stock1){
        stock+=stock1;
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
