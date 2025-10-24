import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DocumentFactory factory = null;

        System.out.println("=== Document Creator ===");
        System.out.println("Select document type:");
        System.out.println("1. Word Document");
        System.out.println("2. PDF Document");
        System.out.println("3. Excel Document");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                factory = new WordDocumentFactory();
                break;
            case 2:
                factory = new PdfDocumentFactory();
                break;
            case 3:
                factory = new ExcelDocumentFactory();
                break;
            default:
                System.out.println("❌ Invalid choice. Exiting.");
                scanner.close();
                return;
        }

        Document document = factory.createDocument();
        System.out.println("✅ Created document of type: " + document.getClass().getSimpleName());

        document.open();
        document.save();
        document.close();

        scanner.close();
    }
}
