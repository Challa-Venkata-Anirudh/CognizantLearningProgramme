class Order {
    int orderId;
    String customerName;
    double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "OrderID: " + orderId + ", Customer: " + customerName + ", Total: $" + totalPrice;
    }
}

public class OrderSorter {
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (orders[j].totalPrice > orders[j+1].totalPrice) {
                    // Swap
                    Order temp = orders[j];
                    orders[j] = orders[j+1];
                    orders[j+1] = temp;
                }
            }
        }
    }
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    public static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice < pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }
    public static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Alice", 250.0),
            new Order(102, "Bob", 75.5),
            new Order(103, "Charlie", 400.0),
            new Order(104, "David", 120.75),
            new Order(105, "Eve", 320.0)
        };
        System.out.println("Original Orders:");
        printOrders(orders);

        Order[] bubbleSortedOrders = orders.clone();
        bubbleSort(bubbleSortedOrders);
        System.out.println("Orders Sorted by Bubble Sort:");
        printOrders(bubbleSortedOrders);

        Order[] quickSortedOrders = orders.clone();
        quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("Orders Sorted by Quick Sort:");
        printOrders(quickSortedOrders);
    }
}
