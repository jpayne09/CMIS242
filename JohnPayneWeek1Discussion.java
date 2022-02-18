import java.lang.System;
import java.util.Scanner;
import java.util.Timer;

public class JohnPayneWeek1Discussion{

    public static String Microwave;
    public static int Timer;

    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);

    public static void displayTimer() {
        System.out.println("Timer on the Microwave : " + Timer + "s");
    }

    public int setTimer(int timeInput) {
        Timer = timeInput;
        return Timer;
    }

    public static void main(String[] args) {

        JohnPayneWeek1Discussion Microwave = new JohnPayneWeek1Discussion();

        double timerVariable = Microwave.setTimer(60);
        displayTimer();

    }
}