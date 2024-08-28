package otherExample.OOP.constructor.ex3;

public class Book {

    private final String title;
    private final String author;
    private double price;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
//        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book myBook = new Book("|Title", "Author");
        Book myBook2 = new Book("|Title2", "Author2", 20.00);

        System.out.println("Book1 Title: " + myBook.title);
        System.out.println("Book1 Author: " + myBook.author);

        System.out.println("Book2 Title: " + myBook2.title);
        System.out.println("Book2 Author: " + myBook2.author);
        System.out.println("Book2 Price: " + myBook2.price);

    }

}
