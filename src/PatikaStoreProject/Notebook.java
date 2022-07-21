package PatikaStoreProject;


public class Notebook extends Product{
        private int rom;

    public Notebook(int id,int price, int discountRate, int stock, String productName, Marka label, int ram, double screenSize, int rom) {
        super(id,price, discountRate, stock, productName, label, ram, screenSize);
        this.rom = rom;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(short rom) {
        this.rom = rom;
    }

    public String toString(){
        String str = String.format("| %4d | %6d | %% %3d | %4d | %20s | %10s | %4d | %4.2f | %5d |",getId(),getPrice(),getDiscountRate() ,getStock(),getProductName(),getLabel().getName(),getRam(),getScreenSize(),getRom()) ;
        return str;

    }
}
