package Media;

import java.util.Calendar;
/**
 * EBook class 
 */
public class EBook extends Media {

    private int numChapters;

    //Class constructor with the necessary parameters
    public EBook(int id, String title, int year, int chapters, boolean availability){
        super(id, title, year, availability);
        numChapters = chapters;
    }
    //Class constructor that will be used to load directory string
    public EBook(String line){
        super(line);
        numChapters  = Integer.parseInt(line.substring(line.indexOf("numChapters") + 12, line.indexOf(",available"))); 
    }
    //Get number of chapters
    public int getNumChapters(){
        return numChapters;
    }
    //Set number of chapters
    public void setNumChapters(int numChapters){
        this.numChapters = numChapters;
    }
    //Calculating rental fee
    @Override
    public double calculateRentalFee(){
        double fee = numChapters * 0.10;
        int currYear = Calendar.getInstance().get(Calendar.YEAR);

        if (this.getYear() == currYear)
            fee += 1;
        // add $1.00 fee
        return fee;
    }
    //Display for EBook information
    public String toString() {
        return "EBook"
                + "[id=" + this.getId() + ","
                + "title=" + this.getTitle() + ","
                + "year=" + this.getYear() + "[Year],"
                + "numChapters=" + numChapters + ","
                + "available=" + getAvailability() + "]";
    }
}
