package Media;

public class IllegalidnumberArgumentException extends IllegalArgumentException {
    
    private int id;

    public IllegalidnumberArgumentException(int id)
    {
        super("ID must be a greater than 0" + id);
    }
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + ":" + id;
    }

}
