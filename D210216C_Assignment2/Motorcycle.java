public class Motorcycle extends Vehicle {
    private int engineCapacity;

    public Motorcycle(String vehicleNumber, String manufacturer, String model, double rentalRate, int engineCapacity) {
        super(vehicleNumber, manufacturer, model, rentalRate);
        this.engineCapacity = engineCapacity;
    }

    // Getter and Setter for engineCapacity
    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    // Calculate and return the top speed based on the engine capacity
    public int calculateTopSpeed() {
        return engineCapacity * 50;
    }

    // Override the toString() method to include engineCapacity
    @Override
    public String toString() {
        return super.toString() + "\nEngine Capacity: " + engineCapacity + "cc";
    }

    // Override the calculateRentalCost() method to add RM150 for motorcycles with a top speed of at least 300
    @Override
    public double calculateRentalCost(int numberOfDays) {
        if (calculateTopSpeed() >= 300) {
            return super.calculateRentalCost(numberOfDays) + 150;
        } else {
            return super.calculateRentalCost(numberOfDays);
        }
    }
}