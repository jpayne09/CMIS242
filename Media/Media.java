package Media;
/**
 * Base media class
 */
public abstract class Media {
    //Private variables
    protected int id;
    private String title;
    private int year;
    private boolean availability;
    //Constructor that accepts media objects with id,title, year and availability
    public Media(int id, String title, int year, boolean availability){
        if(id <= 0)
            throw new IllegalidnumberArgumentException(id);
        this.id = id;
        this.title = title;
        this.year = year;
        this.availability = availability;
    }

     // constructor to parse string with xml tags for its values
     public Media(String line) {
        id = Integer.parseInt(line.substring(line.indexOf("id") + 3, line.indexOf(",title")));
        title = line.substring(line.indexOf("title") + 6, line.indexOf(",year"));
        year = Integer.parseInt(line.substring(line.indexOf("year") + 5, line.indexOf("[Year]")));
    }
    //get id of item
    public int getId(){
        return id;
    }
    //get title of item
    public String getTitle(){
        return title;
    }
    //get year of item
    public int getYear() {
        return year;
    }
    //get availability of item
    public boolean getAvailability(){
        return availability;
    }
    //set availability of item
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    //set title of item
    public void setTitle(String title){
        this.title = title;
    }
    //set year of item
    public void setYear(int year){
        this.year = year;
    }
    //default rental fee
    public double calculateRentalFee(){
        return 3.50;
    }

}
