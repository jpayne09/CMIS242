package Home;

public class IllegalFloorNumberArgumentException extends IllegalArgumentException{
   
    private int numberofFloors;

    public IllegalFloorNumberArgumentException(int numberofFloors)
    {
        super("Number of floors must be greater than 0: numberoffloors =" + numberofFloors);
    }
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + ":" + numberofFloors;
    }

}