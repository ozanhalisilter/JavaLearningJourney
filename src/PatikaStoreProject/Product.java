package PatikaStoreProject;

/* Ürünün sistemde kayıtlı benzersiz numarası

NOTEBOOK
Birim fiyatı---
İndirim oranı---
Stok miktarı----
Ürün adı----
Marka bilgisi (Sistemde ekli olan markalar kullanılacaktır)------
Ram (8 GB)-----
Depolama (512 SSD)
Ekran Boyutu (14 inç)---


TELEFON
Ürünün sistemde kayıtlı benzersiz numarası
Birim fiyatı ---
İndirim oranı ---
Stok miktarı----
Ürün adı-----
Marka bilgisi (Sistemde ekli olan markalar kullanılacaktır)------
Telefonun hafıza bilgisi (128 GB, 64 GB)
Ekran Boyutu (6.1 Inc)---
Pil Gücü (4000)
RAM (6 MB)-----
Renk (Siyah,Kırmızı,Mavi)

*/

public class Product {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    private int price;
    private int discountRate;
    private int stock;
    private String productName;
    private Marka label;
    private int ram;
    private double screenSize;
    public Product(int id,int price, int discountRate, int stock, String productName, Marka label, int ram, double screenSize) {
        this.price = price;
        this.id = id;
        this.discountRate = discountRate;
        this.stock = stock;
        this.productName = productName;
        this.label = label;
        this.ram = ram;
        this.screenSize = screenSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(byte discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public PatikaStoreProject.Marka getLabel() {
        return label;
    }

    public void setLabel(PatikaStoreProject.Marka label) {
        this.label = label;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(short ram) {
        this.ram = ram;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
