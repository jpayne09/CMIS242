package Microwave2;

public class Microwave2 {

    //Declaring Variables
    private String MicrowaveBrand;
    private int MicrowaveTimer;
    //Microwave constructor with brand and timer
    public Microwave2(String MicrowaveBrand, int MicrowaveTimer){
        // validate that name is not invalid
        if (isInvalidStr(MicrowaveBrand)) {
            System.out.println("Invalid brand or description value - cannot be null, empty, or blank");
            return;
        }
        
        this.MicrowaveBrand = MicrowaveBrand;
        this.MicrowaveTimer = MicrowaveTimer;
    }
    
    //Check for invalid string for microwave brand
    private boolean isInvalidStr(String microwaveBrand) {
        if (microwaveBrand.isBlank() || microwaveBrand.isEmpty() ||  microwaveBrand == null)
        return true;
       
    return false;
    }

    //get method for brand
    public String getMicrowaveBrand() {
        return MicrowaveBrand;
    }
    //get method for timer
    public int getMicrowaveTimer(){
        return MicrowaveTimer;
    }
    //set method for brand
    public void setMicrowaveBrand(String MicrowaveBrand){
        this.MicrowaveBrand = MicrowaveBrand;
    }
    //set method for timer
    public void setMicrowaveTimer(int MicrowaveTimer){
        this.MicrowaveTimer = MicrowaveTimer;
    }
}