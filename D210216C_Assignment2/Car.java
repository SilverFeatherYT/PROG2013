public class Car extends Vehicle {
    private int numDoors;

    public Car(String vehicleNumber, String manufacturer, String model, double rentalRate, int numDoors) {
        super(vehicleNumber, manufacturer, model, rentalRate);
        this.numDoors = numDoors;
    }

    // Getter and Setter for numDoors
    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    // Override the toString() method to include numDoors
    @Override
    public String toString() {
        return super.toString() + "\nNumber of Doors: " + numDoors;
    }

    // Override the calculateRentalCost() method to add RM35 per day for cars with more than two doors
    @Override
    public double calculateRentalCost(int numberOfDays) {
        if (numDoors > 2) {
            return super.calculateRentalCost(numberOfDays) + (35 * numberOfDays);
        } else {
            return super.calculateRentalCost(numberOfDays);
        }
    }
}
