public class tasksheet_1_1_10 {
    String title;
    String author;
    int yearPublished;
    double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Hunger Games", "Suzanne Collins", 2008, 22.99);
        Book book2 = new Book("Fifty Shades Darker", "E. L. James", 2012, 10.36);
        Book book3 = new Book("Angels & Demons", "Dan Brown", 2000, 14.66);

        System.out.println("Book 1:");
        System.out.println("Title: " + book1.title);
        System.out.println("Author: " + book1.author);
        System.out.println("Year Published: " + book1.yearPublished);
        System.out.println("Price: $" + book1.price + "\n");

        System.out.println("Book 2:");
        System.out.println("Title: " + book2.title);
        System.out.println("Author: " + book2.author);
        System.out.println("Year Published: " + book2.yearPublished);
        System.out.println("Price: $" + book2.price + "\n");

        System.out.println("Book 3:");
        System.out.println("Title: " + book3.title);
        System.out.println("Author: " + book3.author);
        System.out.println("Year Published: " + book3.yearPublished);
        System.out.println("Price: $" + book3.price);
    }
}
