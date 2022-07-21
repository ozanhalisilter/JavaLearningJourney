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

    public Phone(int id, int price, int discountRate, int stock, String productName, Marka label, int ram, double screenSize,int storage, int batteryCapacity,String color ) {
        super(id ,price, discountRate, stock, productName, label, ram, screenSize);

        this.batteryCapacity = batteryCapacity;
        this.color = color;
        this.storage = storage;


    }

    public String toString(){
        String str = String.format("| %4d | %6d | %% %3d | %4d | %20s | %10s | %4d | %4.2f | %5d | %7d | %9s |",getId(),getPrice(),getDiscountRate() ,getStock(),getProductName(),getLabel().getName(),getRam(),getScreenSize(),getStorage(),getBatteryCapacity(),getColor()) ;
        return str;

    }
}
