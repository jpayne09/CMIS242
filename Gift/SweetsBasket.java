package Gift;

public class SweetsBasket extends Gift {

    private boolean nutsIncluded;
    private double default_price;
    private double totalCost;

    public SweetsBasket(String id, char size, boolean nutsIncluded) {
        super(id, size);
        this.nutsIncluded = nutsIncluded;
        totalCost = this.calcPrice();
    }

    public boolean getnutsIncluded(){
        return nutsIncluded;
    }

    public void setnutsIncluded(boolean nutsIncluded){
        this.nutsIncluded = nutsIncluded;
    }

    
    public double getTotalPrice(){
        return totalCost;
    }

    public void setPrice(char Size) {
        if (size == 'S'){
            this.default_price = 19.99;
            totalCost = this.calcPrice();
        } else if(size == 'M') {
            this.default_price = 29.99;
            totalCost = this.calcPrice();
        } else if (size == 'L') {
            this.default_price = 39.99;
            totalCost = this.calcPrice();
        }
    }

    @Override
    public double calcPrice() {
        if (fruitIdc == true) {
            return default_price + 5.99;
        } else {
            return default_price;
        }

    }
    public String toString(){
        return "Sweets Basket " +  super.toString() + " Price: " +  getTotalPrice() +  " Nuts included: " + getnutsIncluded() + "\n";
    }
    
}
