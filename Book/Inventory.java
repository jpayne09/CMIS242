package Book;
import java.util.ArrayList;
import java.util.Iterator;

// InVentory class to store the books for the book object
public class Inventory {
    //private attribute arraylist to initialize it
    private ArrayList<Book> book = new ArrayList<>();

    //Addbook method to add a book to the array
    public void addBook(int id, String title, double price) {
        Book b = new Book(id, title, price);

        for (Book books : book) {
            if (id == books.getId()) {
                System.out.println("ERROR: Book already added to list. Below is the current listing.");
            }
        }

        book.add(b);
        System.out.println("Book Title: " + b.getTitle() + " Book Id: " + b.getId() + " Book Price: " + b.getPrice());

    }
    //Remove book method to remove the book from the arraylist created. it uses a iterator to loop through each title to find if an identifer is in the list
    public void removeBook(int removeId) {
        Iterator<Book> itr = book.iterator();

        // Check if id in list
        int counter = 0;
        for (Book books : book) {
            if (books.getId() == removeId) {
                counter++;
            } else {

            }
        }

        if (counter == 1) {
            while (itr.hasNext()) {
                Book id = itr.next();
                if (id.getId() == removeId) {
                    itr.remove();
                    System.out.println("Book ID :" + removeId + " removed from the list");
                }

            }
        } else {
            System.out.println("Error, the Book ID: " + removeId + " was not in the list");
        }
    }
    public void findBook(int bookSelection) {
        // Check if id in list
        int positive = 0;
        for (Book books : book) {
            if (books.getId() == bookSelection) {
                System.out.println(
                    "Book ID :" + books.getId() + " Book Title:" + books.getTitle() + " Book Price:" + books.getPrice());
                    positive++;           
            }
        }
        if(positive != 1){
            System.out.println("Sorry, Book not found.");
        }
    }


    //Display book method to get all books and display it to the user
    public void displayAllBooks() {
        Iterator<Book> itr = book.iterator();

        while (itr.hasNext()) {
            Book book = itr.next();
            System.out.println(
                    "Book ID: " + book.getId() + " Book Title: " + book.getTitle() + " Book Price: " + book.getPrice());
        }

    }
}
