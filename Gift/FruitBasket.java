package Gift;

import java.text.DecimalFormat;

public class FruitBasket extends Gift {

    private int numberofFruits;
    private boolean fruitIdc;
    private double totalCost;
    private double default_price;

    public FruitBasket(String id, char size, int numberofFruits, boolean fruitIdc) {
        super(id, size);
        this.numberofFruits = numberofFruits;
        this.fruitIdc = fruitIdc;
        totalCost = this.calcPrice();
    }

	public int getnumberofFruits(){
        return numberofFruits;
    }

    public boolean getfruitIdc(){
        return fruitIdc;
    }

    public double getTotalPrice(){
        return totalCost;
    }

    @Override
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
    
    public void setfruitIdc(boolean fruitIdc){
        this.fruitIdc = fruitIdc;
    }
    

    public void setnumberofFruits(int numberofFruits) {
        this.numberofFruits = numberofFruits;
    }

    public double roundTwoDecimals(double d) {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        return Double.valueOf(twoDForm.format(d));
    }

    public String toString(){
        return "Fruit Basket " + super.toString()+  " The price is " + roundTwoDecimals(getTotalPrice()) +  " The fruit indiciation is : " + getfruitIdc()
           + " The number of fruits : " + getnumberofFruits() + "\n";
    }
    
}
