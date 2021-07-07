package Media;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Media Rental System
 * This application defines media objects, finds media objects based on title and rent items.
 */

 //Begin of media rental system class
public class MediaRentalSystem {

    //private  attribute to set the Inventory class to a attribute
    private Manager mg;
    //Constructor created to set the new attribute to the inventory object
    public MediaRentalSystem(){
        mg = new Manager();
    }
    //Display menu
    public static void displayMenu() {
        System.out.println("1: Load Media Objects");
        System.out.println("2: Find Media with title Objects");
        System.out.println("3: Rent Media Objects and create text files in directory");
        System.out.println("4: Display all media Objects");
        System.out.println("9: Quit");
    }

    //Selection method for display menu
    public void selectOption(int c) {
        Scanner sc1 = new Scanner(System.in);

        switch (c) {
            // Case 1 will create the objects and store it
            case 1:
                //Creating media objects
                try {
                    Media eb = new EBook(1, "Hello1 EBook", 2021, 10, true);
                    Media eb1 = new EBook(2, "Hello2 EBook", 2000, 2, true);
                    Media md = new MovieDVD(10, "Hello3 Dvd", 1989, 5, true);
                    Media mc = new MusicCD(20, "Hello4 CD", 2010,60,true);
                    //Adding media objects
                    mg.addMedia(eb);
                    mg.addMedia(eb1);
                    mg.addMedia(md);
                    mg.addMedia(mc);
                    //Printing media objects
                    System.out.println(eb + "\n" + eb1 + "\n" + md + "\n" + mc);
                } catch (IllegalidnumberArgumentException e) {
                    //TODO: handle exception
                    System.out.println("\nTRY AGAIN! Invalid id number," + e.getMessage());
                }
                break;
            //Case 2 will find the media object based on string title value
            case 2:
                System.out.print("Enter the title you want to retrieve:");
                String input = sc1.nextLine();
                mg.FindMedia(input);
                break;
            //Case 3 will find the media object based on ID
            case 3:
                System.out.print("Enter the id: ");
                int id = sc1.nextInt();
                mg.rentMedia(id);
                try {
                    mg.createMedia("C:/temp");
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                break;
            case 4:
                //Case 5 loads the existing objects and displays
                try {
                    // create new manager object loading the files
                    Manager mgt2 = new Manager("C:/temp");
                   
                    // // display pets data to the console (in xml tag format)
                    System.out.println("\n objects loaded by manager2 at startup:");
                    mgt2.displayAllMedia();
                   
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                
                break;
            case 9:
                // Exiting the application
                System.exit(0);
                System.out.print("Thank you");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    //Main method to run application
    public static void main(String[] args) {
        MediaRentalSystem run = new MediaRentalSystem();
        Scanner sc = new Scanner(System.in);
        int selection = 0;
        do {
            MediaRentalSystem.displayMenu();

            System.out.print("Enter your selection :");
            selection = sc.nextInt();

            run.selectOption(selection);
        }while(selection != 9);  
        sc.close();
    }
}
//End of Media Rental System class