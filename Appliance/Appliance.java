package Appliance;

public class Appliance {
    
    private String brandName;

    public Appliance(String brandName){
        this.brandName = brandName;
    }

    public void setApplianceBrand(String brandName){
        this.brandName = brandName;
    }

    public String getapplianceBrand(){
        return brandName;
    }
    public String toString(){
        return "The appliance brand is: " + getapplianceBrand();
    }
}