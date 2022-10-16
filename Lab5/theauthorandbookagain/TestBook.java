package theauthorandbookagain;

public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book aBook = new Book("Java for dummy", authors, 19.95, 1000);

        Book anotherBook =
                new Book(
                        "more Java for dummy",
                        new Author[] {
                                new Author("Bruce Eckel", "b.eckel@somewhere.com", 'm'),
                                new Author("Paul Tan", "Paul@nowhere.com", 'm')
                        },
                        29.95,
                        888);

        System.out.println("\nThe book: " + aBook);
        System.out.println("The authors are:");
        aBook.printAuthors();

        System.out.println("\nThe book: " + anotherBook);
        System.out.println("The authors are:");
        anotherBook.printAuthors();
    }
}
