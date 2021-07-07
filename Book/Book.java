package Book;
/**
 * Book Class that defines a books ID(identifier), Title(Book Title), Price(Cost of book)
 */
public class Book {

    //Private attributes for id,title and price
    private int id;
    private String title;
    private double price;

    //Book Constructor  created for the class Book
    public Book(int id, String title, double price) {

        if (id < 0) {
            System.out.println("Invalid id");
            return;
        }
        this.id = id;
        this.title = title;
        this.price = price;
    }

    //get method to retrieve the title of a book
    public String getTitle() {
        return title;
    }
    //get method to retrieve the identifer of a book
    public int getId() {
        return id;
    }
    //get method to retrieve the price of a book
    public double getPrice() {
        return price;
    }
}
