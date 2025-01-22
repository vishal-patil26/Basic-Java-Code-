// Class definition
public class MobileDevice {
    // Attributes
    private String brand;
    private String model;
    private double price;
    private int storageCapacity;

    // Getter (accessor) methods
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    // Setter (mutator) methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    // Main method for testing
    public static void main(String[] args) {
        MobileDevice device = new MobileDevice();

        // Setting values using setter methods
        device.setBrand("Samsung");
        device.setModel("Galaxy S23");
        device.setPrice(999.99);
        device.setStorageCapacity(256);

        // Getting values using getter methods
        System.out.println("Brand: " + device.getBrand());
        System.out.println("Model: " + device.getModel());
        System.out.println("Price: $" + device.getPrice());
        System.out.println("Storage Capacity: " + device.getStorageCapacity() + "GB");
    }
}