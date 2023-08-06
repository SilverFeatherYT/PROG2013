import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("JVP1547", "Toyota", "Altis", 100, 4);
        vehicles[1] = new Car("VIP999", "BMW", "X5", 100, 2);
        vehicles[2] = new Motorcycle("JSF6882", "Honda", "CBR500R", 80, 500);

        int numberOfDays;
        System.out.print("Enter the number of rental days: ");
        numberOfDays = scanner.nextInt();

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            System.out.println(
                    "Total Rental Cost for " + numberOfDays + " days: RM" + vehicle.calculateRentalCost(numberOfDays));
            if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                System.out.println("Top Speed: " + motorcycle.calculateTopSpeed() + " km/h");
            }
            System.out.println("------------------------------");
        }
    }
}
