// PhysicalBook subclass
public class PhysicalBook extends Book {
    private double weight;
    
    public PhysicalBook(String title, String author, double price, int quantity, double weight) {
        super(title, author, price, quantity);
        this.weight = weight;
    }
    
    // Getters and setters
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    // Task methods
    public double calculateShippingCost() {
        double initialWeight = 500.0;
        double additionalWeight = weight - initialWeight;
        int additionalFee = (int) (additionalWeight / 250) * 1;
        return 4.50 + additionalFee;

        // double shippingCost = 4.50;
        // double additionalWeight = weight - 500;
        // if (additionalWeight > 0) {
        //     int extraCharges = (int) (additionalWeight / 250);
        //     shippingCost += extraCharges;
        // }
        // return shippingCost;
    }
    
    public double getWeightInPounds() {
        double weightInPounds = weight * 0.00220462; // 1 gram = 0.00220462 pounds
        return Math.round(weightInPounds * 100.0) / 100.0; // Rounded to two decimal places
    }
}