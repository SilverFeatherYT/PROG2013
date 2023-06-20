// Testing the objects
public class Main {
    public static void main(String[] args) {
        // Creating an EBook object
        EBook ebook = new EBook("Harry Potter and the Deathly Hallows", "Rowling, J.K.", 19.99, 100, ".pdf");
        System.out.println("EBook details:");
        System.out.println("Title: " + ebook.getTitle());
        System.out.println("Author: " + ebook.getAuthor());
        System.out.println("Price: RM" + ebook.getPrice());
        System.out.println("Quantity: " + ebook.getQuantity());
        System.out.println("File Format: " + ebook.getFileFormat());
        ebook.openBook();
        ebook.downloadBook();
        System.out.println("Format is valid: " + ebook.validateFormat());
        System.out.println();

        // Creating a PhysicalBook object
        PhysicalBook physicalBook = new PhysicalBook("Scooby-Doo and the Santa Claus Mystery", "Fern G. Brown", 24.99,
                50, 1800);
        System.out.println("Physical Book details:");
        System.out.println("Title: " + physicalBook.getTitle());
        System.out.println("Author: " + physicalBook.getAuthor());
        System.out.println("Price: RM" + physicalBook.getPrice());
        System.out.println("Quantity: " + physicalBook.getQuantity());
        System.out.println("Weight: " + physicalBook.getWeight() + "g");
        System.out.println("Shipping Cost: RM" + physicalBook.calculateShippingCost());
        System.out.println("Weight in pounds: " + physicalBook.getWeightInPounds() + " lbs");
    }
}