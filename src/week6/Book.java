package week6;

public class Book {

    private String title;
    private String author;
    private double price;

    public Book(final String title, final String author, final double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void changePrice(double newPrice)
    {
        price = newPrice;
    }

    public double returnPrice()
    {
        return price;
    }

    public String toString()
    {
        return title + " By Author: " + author + " costs $" + price;
    }


}
