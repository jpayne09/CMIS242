package Appliance;

public class MicrowaveApp extends Appliance{

    private String applianceName;

    public MicrowaveApp(String brandName, String applianceName){
        super(brandName);
        this.applianceName = applianceName;
    }

    public String getapplianceName(){
        return applianceName;
    }
    public void setapplianceBrand(String applianceName){
        this.applianceName = applianceName;
    }

    public String toString(){
        return "Appliance Name:" + applianceName + " Brand: " + getapplianceBrand();
    }
}
