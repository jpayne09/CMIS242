package Media;

/**
 * MovieDVD Class
 */
public class MovieDVD extends Media {

    private double size;

    // constructor
    public MovieDVD(int id, String title, int year, double size, boolean availability) {
        super(id, title, year, availability);
        this.size = size;
    }
    //MovieDVD constructor object
    public MovieDVD(String line){
        super(line);
    }

    // get method
    public double getSize() {
        return size;
    }
    
    public void setSize(double size){
        this.size = size;
    }
    
    //Display moviedvd info
    @Override
    public String toString(){
        return "MovieDVD"
                + "[ id=" + this.getId() + "," 
                + "title=" + this.getTitle() + ","
                + "year=" + this.getYear() + "[Year],"
                + "size=" + size + "MB,"
                + "availabile=" + getAvailability() + "]";
    }
}
