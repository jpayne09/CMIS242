package Gift;

public abstract class Gift {

    //Declaring variables
    protected String id;
    protected char size;
    protected double totalCost;
    protected boolean fruitIdc;
    //Creation of gift constructor
    public Gift(String id, char size){
        this.id = id;
        this.size = size;
    }

    //Set ID # for item
    public void setId(String id){
        this.id = id;
    }
    //Set size of gift purchase
    public void setSize(char size){
        this.size = size;
    }
    // Get ID # for item
    public String getId(){
        return id;
    }
    // Get Size of item
    public char getSize(){
        return size;
    }
    // Get Fruit citrus indicator
    public boolean getfruitIdc(){
        return fruitIdc;

    }
    // To String method to display id and size
    public String toString(){
        return "The id is: " + getId() + " The Size is: " + getSize();
    }

    // default calculation of price
    public abstract double calcPrice();
    // number of fruits created to access from orderystem
    public void setnumberofFruits(int i){
    }

    // set price created to access from orderystem

	public void setPrice(char size) {
	}

    // set fruits created to access from orderystem

    public void setfruitIdc(boolean fruitIdc){};

    // set nuts created to access from orderystem

    public void setnutsIncluded(boolean nutsIncluded){

    }
    // get nuts created to access from ordersystem
    public boolean getnutsIncluded(){
        return null != null;
    }

}