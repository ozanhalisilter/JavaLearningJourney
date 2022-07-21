package PatikaStoreProject;

public class Phone extends Product {

    private int batteryCapacity;

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    private String color;
    private int storage;

    public Phone(int price, int discountRate, int stock, String productName, Marka label, int ram, double screenSize,int storage, int batteryCapacity,String color ) {
        super(price, discountRate, stock, productName, label, ram, screenSize);
        this.batteryCapacity = batteryCapacity;
        this.color = color;
        this.storage = storage;


    }
}
