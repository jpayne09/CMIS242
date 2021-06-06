package Home;

public class TownHome extends Home {
    public double hoaFee;
    public String color;

    public TownHome(String type, int numberofFloors, double hoaFee) {
        super(type, numberofFloors);
        this.hoaFee = hoaFee;
    }

    public double getTownHomeFee(){
        return hoaFee;
    }

    public void setTownHomeFee(double hoaFee){
        this.hoaFee = hoaFee;
    }

    public void setHomeColor(String color){
        this.color = color;
    }

    public String getHomeColor(){
        return color;
    }
    
}
