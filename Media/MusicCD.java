package Media;

/**
 * Music CD class
 */
import java.util.Calendar;

public class MusicCD extends Media {
    // local attributes
    private int length;

    // constructor
    public MusicCD(int id, String title, int year, int length, boolean availability) {
        super(id, title, year, availability);
        this.length = length;
    }
    //Music cd contstructor for file object
    public MusicCD(String line){
        super(line);
    }

    // get method
    public int getLength() {
        return length;
    }

    // set method
    public void setLength(int length) {
        this.length = length;
    }

    //Calculating rental fee
    @Override
    public double calculateRentalFee() {
        double fee = length * 0.02;
        // basic fee
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        if (this.getYear() == currYear)
            fee += 1;
        // add $1.00 fee
        return fee;
    }
    //Display music cd info
    @Override
    public String toString() {
        return "MusicCD"
            + "[id=" + getId() + "," 
            + "title=" + getTitle() + "," 
            + "year=" + getYear() + "[Year]," 
            + "length=" + length + "min,"
            + "availability=" + getAvailability() + "]";
    }
}
