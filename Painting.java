public class Painting {
    
    // constants
    private final double SHIPPING_FEE = 19.99;
    private final double SHIPPING_OVERWEIGHT_FEE = 5.99; // extra fee when weight is greater than 20
    
    // attributes (instance variables)
    private String id;                // do not want to ever change
    private String description;        // do not want to allow null or empty strings or greater than 500 chars
    private double weight;            // whenever changed want to update shipping cost
    private double shippingCost;    // needs to be calculated and not set by the object's user
    
    // constructor
    public Painting(String id, String description, double weight) {
       
        // validate that name is not invalid
        if (isInvalidStr(id) || isInvalidStr(description)) {
            System.out.println("Invalid id or description value - cannot be null, empty, or blank");
            return;
        }
       
        // validate that description is less than 500 chars
        if (description.length() > 500) {
            System.out.println("Invalid description length - has to be 500 or less characters");
            return;
        }
       
        // validate that weight is greater than 0
        if (weight <= 0) {
            System.out.println("Invalid weight value - must be greater than 0");
            return;
        }
       
        // set values
        this.id = id;
        this.description = description;
        this.weight = weight;
        shippingCost = this.calcShipping();
    }

    // get methods to get the value of the attribute
    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    // set methods
    public void setDescription(String description) {
       
        // validate that name is not invalid
        if (isInvalidStr(description)) {
            System.out.println("Invalid description value - cannot be null, empty, or blank");
            return;
        }
               
        // validate that description is less than 500 chars
        if (description.length() > 500) {
            System.out.println("Invalid description length - has to be 500 or less characters");
            return;
        }
       
        this.description = description;
    }

    public void setWeight(double weight) {
       
        // validate that weight is greater than 0
        if (weight <= 0) {
            System.out.println("Invalid weight value - must be greater than 0");
            return;
        }
        this.weight = weight;
        shippingCost = this.calcShipping();
    }
    
    // method to validate that string is not null, empty, or blank
    private boolean isInvalidStr(String str) {
           
        if (str.isBlank() || str.isEmpty() || str == null)
            return true;
           
        return false;
    }
    
    // calculate shipping
    private double calcShipping() {
       
        if (weight > 20)
            return SHIPPING_FEE + SHIPPING_OVERWEIGHT_FEE;
        else
            return SHIPPING_FEE;
       
    }
}