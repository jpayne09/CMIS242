package Gift;

public class SweetsBasket extends Gift {

    private boolean nutsIncluded;

    public SweetsBasket(String id, char size, boolean nutsIncluded) {
        super(id, size);
        this.nutsIncluded = nutsIncluded;
        
    }

    public boolean getnutsIncluded(){
        return nutsIncluded;
    }

    public void setnutsIncluded(boolean nutsIncluded){
        this.nutsIncluded = nutsIncluded;
    }

    public String toString(){
        return "Sweets Basket " +  super.toString() +  " Nuts included: " + getnutsIncluded() + "\n";
    }
    
}
