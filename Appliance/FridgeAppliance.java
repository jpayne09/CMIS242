package Appliance;

public class FridgeAppliance extends Appliance{

    public FridgeAppliance(String brandName) {
        super(brandName);
        // TODO Auto-generated constructor stub
    }


    public String toString(){
        return "Brand: "+ getapplianceBrand();
    }
}
