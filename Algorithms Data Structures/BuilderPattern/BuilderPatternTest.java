public class BuilderPatternTest {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("Intel i3", "8GB").build();
        System.out.println(basicComputer);

        System.out.println("\n-----------------------------\n");

        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setStorage("2TB SSD")
                .setOperatingSystem("Windows 11")
                .build();
        System.out.println(gamingComputer);

        System.out.println("\n-----------------------------\n");

        Computer officeComputer = new Computer.Builder("AMD Ryzen 5", "16GB")
                .setStorage("1TB HDD")
                .setOperatingSystem("Ubuntu Linux")
                .build();
        System.out.println(officeComputer);
    }
}
