// Implement a Java class Book with attributes title, author, and price. Create an array of Book objects, populate it with data, and write a program to display the books with a price less than $20.
public class Question5 {
    String title;
    String author;
    double price;

    public Question5(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Question5[] books = new Question5[3];
        books[0] = new Question5("Book 1", "Author 1", 15.99);
        books[1] = new Question5("Book 2", "Author 2", 25.99);
        books[2] = new Question5("Book 3", "Author 3", 10.99);

        System.out.println("Books with price less than $20:");
        for (Question5 book : books) {
            if (book.price < 20.0) {
                System.out.println("Title: " + book.title);
                System.out.println("Author: " + book.author);
                System.out.println("Price: $" + book.price);
                System.out.println();
            }
        }
    }
}
