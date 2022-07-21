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
}
