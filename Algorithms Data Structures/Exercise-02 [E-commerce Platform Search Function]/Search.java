import java.util.Arrays;
import java.util.Comparator;

public class Search {

    // Linear search by product name
    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    // Binary search by product name (on sorted array)
    public static Product binarySearch(Product[] products, String name) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = products[mid].productName.compareToIgnoreCase(name);
            if (result == 0) return products[mid];
            if (result < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Smartphone", "Electronics"),
            new Product(104, "Book", "Stationery"),
            new Product(105, "Backpack", "Travel")
        };

        // Linear Search (unsorted)
        System.out.println("Linear Search: " + linearSearch(products, "Book"));

        // Sort by productName for binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        // Binary Search (sorted)
        System.out.println("Binary Search: " + binarySearch(products, "Book"));
    }
}
