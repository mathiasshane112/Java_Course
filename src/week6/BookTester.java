package week6;

public class BookTester {

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 12.99);
        System.out.println(book1);
        book1.changePrice(14.99);
        System.out.println(book1);
    }


}
