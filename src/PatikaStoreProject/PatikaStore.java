package PatikaStoreProject;
/*
 Markalar listelenirken her zaman alfabe sırasıyla listelenmelidir.
Markalar statik olarak kod blokları içerisinden aşağıdaki sıra ile eklenmelidir.
Markalar : Samsung, Lenovo, Apple, Huawei, Casper, Asus, HP, Xiaomi, Monster
Kullanıcı sistem üzerinden ilgili kategorideki (Notebook, Cep Telefonları vb.) ürünleri listeyebilimeli
Ürünler listelenirken tablo şeklinde konsol ekranında gösterilmeli (System.out.format() kullanılabilir)
Kullanıcı ürün ekleyebilmeli ve ürünün grubunu (Cep Telefonu, Notebook vb.) seçebilmeli.
Kullanıcı ürünleri benzersiz numaralarına göre silebilmeli.
Kullanıcı ürünlerin benzersiz numaralarına ve markalarına göre filtreleyip listeleyebilmeli.*/


import java.util.ArrayList;

public class PatikaStore {

    public static void main(String[] args) {

        ArrayList<Marka> markaList = new ArrayList<>();
        markaList.add(new Marka("Samsung", 1));
        markaList.add(new Marka("Lenovo", 2));
        markaList.add(new Marka("Apple", 3));
        markaList.add(new Marka("Huawei", 4));
        markaList.add(new Marka("Casper", 5));
        markaList.add(new Marka("Asus", 6));
        markaList.add(new Marka("HP", 7));
        markaList.add(new Marka("Xiaomi", 8));
        markaList.add(new Marka("Monster", 9));




    }

}
