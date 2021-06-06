package Home;

public class SingleFamilyHome extends Home {
    private double generalHomeMaintenance;

    public SingleFamilyHome(String type, int numberofFloors, double generalHomeMaintenance) {
        super(type, numberofFloors);
        this.generalHomeMaintenance = generalHomeMaintenance;

    }

    public double getHomeMaintenance(double generalHomeMaintenance){
        return generalHomeMaintenance;
    }

    public void setHomeMaintenanceCost(double generalHomeMaintenance){
        this.generalHomeMaintenance = generalHomeMaintenance;

    }

    @Override
    public String toString() {
        return("General Home Monthly Maintenace cost is: " + generalHomeMaintenance);
    }

    

    
}
