package Gift;

public abstract class Gift {


    protected String id;
    protected char size;
    protected double totalCost;
    protected boolean fruitIdc;

    public Gift(String id, char size){
        this.id = id;
        this.size = size;
    }


    public void setId(String id){
        this.id = id;
    }
    public void setSize(char size){
        this.size = size;
    }

    public String getId(){
        return id;
    }
    public char getSize(){
        return size;
    }

    public boolean getfruitIdc(){
        return fruitIdc;

    }

    public String toString(){
        return "The id is: " + getId() + " The Size is: " + getSize();
    }
    public double calcPrice() {
        return totalCost;
    }

    public void setnumberofFruits(int i){
    }


	public void setPrice(char size) {
	}


    public void setfruitIdc(boolean fruitIdc){
        this.fruitIdc = fruitIdc;
    }


    public void setnutsIncluded(boolean nutsIncluded){

    }

    public boolean getnutsIncluded(){
        return null != null;
    }

}