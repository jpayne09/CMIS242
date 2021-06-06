package Home;


public abstract class Home {

    private String type;
    private int numberofFloors;

    
    public Home(String type, int numberofFloors){
        this.type = type;
        this.numberofFloors = numberofFloors;
    }

    public String getHomeType() {
        return type;
    }
    public int getHomeFloors(){
        return numberofFloors;
    }

    public void setHomeType(String type){
        this.type = type;
    }


    public void setHomeFloors(int numberofFloors){
        this.numberofFloors = numberofFloors;
    }
}
