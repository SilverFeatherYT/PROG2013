// Testing the objects
public class Main {
    public static void main(String[] args) {
        // Creating an EBook object
        EBook ebook = new EBook("The Great Gatsby", "F. Scott Fitzgerald", 9.99, 100, ".pdf");
        System.out.println("EBook details:");
        System.out.println("Title: " + ebook.getTitle());
        System.out.println("Author: " + ebook.getAuthor());
        System.out.println("Price: $" + ebook.getPrice());
        System.out.println("Quantity: " + ebook.getQuantity());
        System.out.println("File Format: " + ebook.getFileFormat());
        ebook.openBook();
        ebook.downloadBook();
        System.out.println("Format is valid: " + ebook.validateFormat());
        System.out.println();
        
        // Creating a PhysicalBook object
        PhysicalBook physicalBook = new PhysicalBook("To Kill a Mockingbird", "Harper Lee", 14.99, 50, 800);
        System.out.println("Physical Book details:");
        System.out.println("Title: " + physicalBook.getTitle());
        System.out.println("Author: " + physicalBook.getAuthor());
        System.out.println("Price: $" + physicalBook.getPrice());
        System.out.println("Quantity: " + physicalBook.getQuantity());
        System.out.println("Weight: " + physicalBook.getWeight() + "g");
        System.out.println("Shipping Cost: $" + physicalBook.calculateShippingCost());
        System.out.println("Weight in pounds: " + physicalBook.getWeightInPounds() + " lbs");
    }
}