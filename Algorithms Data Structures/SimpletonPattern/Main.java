public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application has started.");
        logger2.log("Logger reused for another message.");

        if (logger1 == logger2) {
            System.out.println("Both logger references point to the same instance.");
        } else {
            System.out.println("Different logger instances exist");
        }
    }
}
