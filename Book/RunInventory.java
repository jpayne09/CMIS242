package Book;

import java.util.Scanner;

/**
 * RunInventory class that will run the main method, display menu for the user
 */
public class RunInventory {

    //private  attribute to set the Inventory class to a attribute
    private Inventory mainBook;
    //Constructor created to set the new attribute to the inventory object
    public RunInventory(){
        mainBook = new Inventory();
    }
    //Menu Display for user
    public static void displayMenu() {
        System.out.println("\n MENU");
        System.out.println("\n 1: Add book");
        System.out.println("\n 2: Remove book");
        System.out.println("\n 3: Find book");
        System.out.println("\n 4: Display all books");
        System.out.println("\n 9: Exit program");

    }
    //Method to make a decision based on the user options
    public void selectOption(int c) {
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        switch (c) {
            case 1:
                System.out.println("What is the book id (int value");
                int id = sc3.nextInt();
                System.out.println("What is the book price (double value)");
                double price = sc3.nextDouble();
                System.out.println("What is the book title");
                String title = sc4.nextLine();
                mainBook.addBook(id, title, price);
                break;
            case 2:
                System.out.println("Please enter book id for removal");
                int removeId = sc3.nextInt();
                mainBook.removeBook(removeId);
                break;
            case 3:
                System.out.println("Please enter book id for retrieval");
                int bookSelection = sc3.nextInt();
                mainBook.findBook(bookSelection);
                break;
            case 4:
                mainBook.displayAllBooks();
                break;
            case 9:
                sc3.close();
                sc4.close();
                System.out.println("Thank you for using our system. Have a nice day!");
                break;
            default:
                System.out.println("");
        }
    }

    //Main method that will run the code
    public static void main(String[] args) {
        RunInventory run = new RunInventory();
        Scanner sc = new Scanner(System.in);
        int s = 0;
        do {
            displayMenu();
            System.out.print("\nEnter your selection :");
            s = sc.nextInt();
            run.selectOption(s);

        } while (s != 9);
        
        sc.close();
    }
}
