package Media;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Manager class that will have the methods to peform the media rental system actions.
 */
public class Manager {
    
    //private ArrayList<String> mediaList = new ArrayList<>();
    private ArrayList<Media> mediaList;

    public Manager(){
        mediaList = new ArrayList<Media>();
    }

    public Manager(String directory) throws FileNotFoundException {
       
        // initialize empty pets list
        mediaList = new ArrayList<Media>();
       
        // Create a File object for directory
        File directoryPath = new File(directory);
       
        // Get list of all files and directories
        File fileslist[] = directoryPath.listFiles();
       
        if (fileslist == null)
            throw new FileNotFoundException("Could not load, no such directory");
       
        // declare local variables
        Media media = null;
        String line = null;
        Scanner scan = null;

        for (File file : fileslist) {

            if (file.getName().contains("EBook") || file.getName().contains("MovieDVD") || file.getName().contains("MusicCD")){
                // open and read line (assumes whole object is stored on single line)
                scan = new Scanner(new FileReader(file));
                while(scan.hasNextLine()){
                    line = scan.nextLine();   // assumes the file is not empty
                    if(line.contains("EBook")){
                    media = new EBook(line);
                    } else if(line.contains("MovieDVD")){
                        media = new MovieDVD(line);
                    } else if(line.contains("MusicCD")){
                        media = new MusicCD(line);
                    } 
                    mediaList.add(media);

                }
            }
        }
    }
        
    
    

   
    public void createMedia(String directory) throws IOException {    
        PrintWriter out = null;
        // for all Pet objects create files using Pet type and id value as filename
        for (int i=0; i < mediaList.size(); i++) {
            String filename = directory + "/" + mediaList.get(i).getClass().getSimpleName() + "-" + mediaList.get(i).getId() + ".txt";
            out = new PrintWriter(new FileWriter(filename));  // create/overwrite file
            out.println(mediaList.get(i).toString());  // write the pet's data
            out.flush();      // flush all the data to the file
            out.close();    // close the stream
        }
}
    public void FindMedia(String title) {
        String line=null;
        String t;
        for (Media m : mediaList) {
            line = m.toString();
            t = line.substring(line.indexOf("title") + 5, line.indexOf(",year"));
                if(t.contains(title)){
                    System.out.println(m);
                }

        }
    }
    //displays all media
    public void displayAllMedia() {
       
        if(mediaList.size() == 0){
            System.out.println("Nothing in list, please rent media objects to create");
        }else{
        // for all  objects display the xml tag data
        for (int i=0; i < mediaList.size(); i++) {
            System.out.println(mediaList.get(i));
        }
      }
    }
    //finds id of item and sets availability to false
    public void rentMedia(int id){
        String line=null;
        String t;  
        for (Media m : mediaList) {
            line = m.toString();
            t = line.substring(line.indexOf("id") + 3, line.indexOf(",title"));
                if(id == Integer.parseInt(t)){
                    m.setAvailability(false);
                    System.out.println(m);
                    System.out.println("The rental fee is : " + "$"+m.calculateRentalFee());
                }

        }
    }
    //method to add media to the list
    public void addMedia(Media media) {
        mediaList.add(media);
    }

}
