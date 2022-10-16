package theauthorandbookagain;

public class Book {

    private String name;
    private double price;
    private Author[] authors;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void printAuthors() {
        int authorNo = 0;
        for (Author a : this.authors) {
            System.out.println("(" + (++authorNo) + ") " + a);
        }
    }

    public String toString() {
        return "'" + name + "' by " + authors.length + " authors";
    }
}
