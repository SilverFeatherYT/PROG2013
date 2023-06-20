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
        double shippingCost = 4.50;
        double additionalWeight = weight - 500;
        if (additionalWeight > 0) {
            int extraCharges = (int) (additionalWeight / 250);
            shippingCost += extraCharges;
        }
        return shippingCost;
    }
    
    public double getWeightInPounds() {
        return weight / 453.59237; // 1 gram = 0.00220462 pounds
    }
}