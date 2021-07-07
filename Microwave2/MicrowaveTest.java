package Microwave2;
import java.util.List;
import java.util.stream.*;
/**
 * Microwave object to set a brand and timer
 */
public class MicrowaveTest {
    public static void main(String[] args) {

        Microwave2 microwave = new Microwave2("LG", 60);
        Microwave2 microwave2 = new Microwave2("Samsung", 70);

        // Current brand of your microwave
        //.out.println("The current Microwave brand is: " + microwave.getMicrowaveBrand() + " and  The current Timer: " + microwave.getMicrowaveTimer());
        //Microwave set to a new brand
        //microwave.setMicrowaveBrand("LG");
        //Microwave set timer
        //microwave.setMicrowaveTimer(60);
        //Display new brand
        //System.out.println("Your new Microwave brand is: " + microwave.getMicrowaveBrand() + " and The new Timer: " + microwave.getMicrowaveTimer() + "s");

        List<Microwave2> micro = List.of(microwave,microwave2);

        String filter = 
            micro.stream()
                .map(m -> m.getMicrowaveBrand())
                .filter(microwaveBrand -> microwaveBrand == "LG");

        System.out.println("Brand = " + filter);
    }
}
