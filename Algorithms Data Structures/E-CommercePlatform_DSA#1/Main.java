import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Mouse", "Electronics"),
            new Product(105, "Shirt", "Apparel"),
            new Product(102, "Keyboard", "Electronics"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Notebook", "Stationery")
        };
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
        int searchId = 103;
        System.out.println("🔍 Linear Search:");
        
        Product result1 = SearchUtility.linearSearch(products, searchId);
        System.out.println(result1 != null ? "Found: " + result1 : "Product not found");
        System.out.println("\n⚡ Binary Search:");
        Product result2 = SearchUtility.binarySearch(products, searchId);
        System.out.println(result2 != null ? "Found: " + result2 : "Product not found");
    }
}
