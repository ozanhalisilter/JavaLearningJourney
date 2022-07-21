package PatikaStoreProject;


public class Notebook extends Product{
        private short rom;

    public Notebook(double price, byte discountRate, int stock, String productName, Marka label, short ram, double screenSize, short rom) {
        super(price, discountRate, stock, productName, label, ram, screenSize);
        this.rom = rom;
    }

    public short getRom() {
        return rom;
    }

    public void setRom(short rom) {
        this.rom = rom;
    }
}
