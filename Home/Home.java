package Home;


public abstract class Home {

    private String type;
    private int numberofFloors;
    private String typeofFloors;
    
    public Home(String type, int numberofFloors){
        if(numberofFloors <= 0)
            throw new IllegalFloorNumberArgumentException(numberofFloors);

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
    public void setHomeFloors(int numberofFloors, String typeofFloors){
        setHomeFloors(numberofFloors);
        this.typeofFloors = typeofFloors;
    }


    public String toString() {
        return("---Welcome to the Home Application----" + 
            "\nThe type of home is: " + type +  "\nNumber of floors is: " + numberofFloors +  "\nType material of floor is: "+ typeofFloors);
    }
}
