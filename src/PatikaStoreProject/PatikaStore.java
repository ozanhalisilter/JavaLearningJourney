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

        Marka samsung = new Marka("Samsung", 1);
        Marka Lenovo = new Marka("Lenovo", 2);
        Marka Apple = new Marka("Apple", 3);
        Marka Huawei = new Marka("Huawei", 4);
        Marka Casper = new Marka("Casper", 5);
        Marka Asus = new Marka("Asus", 6);
        Marka HP = new Marka("HP", 7);
        Marka Xiaomi = new Marka("Xiaomi", 8);
        Marka Monster = new Marka("Monster", 9);

        ArrayList<Marka> markaList = new ArrayList<>();
                markaList.add(samsung);
                markaList.add(Lenovo);
                markaList.add(Apple);
                markaList.add(Huawei);
                markaList.add(Casper);
                markaList.add(Asus);
                markaList.add(HP);
                markaList.add(Xiaomi);
                markaList.add(Monster);


        ArrayList<Notebook> notebookArrayList = new ArrayList<>();


        notebookArrayList.add( new Notebook(1,20000,20,100,"Matebook 15h37829", Huawei, 16,15.6,512));
        notebookArrayList.add( new Notebook(2,2000,20,100,"Matebook 531das231", Huawei, 16,16.6,1024));
        notebookArrayList.add( new Notebook(3,2000,20,100,"Matebook 213213", Huawei, 32,17.6,512));
        notebookArrayList.add( new Notebook(4,2000,20,100,"Matebook 352gd123", Huawei, 8,13.6,1024));


        ArrayList<Phone> phoneArrayList = new ArrayList<>();

        phoneArrayList.add( new Phone( 5,3200,10,100,"SAMSUNG GALAXY A5", samsung, 4, 6.1,128,5000,"BLACK"));
        phoneArrayList.add( new Phone( 6,1234,10,100,"SAMSUNG GALAXY A8", samsung, 3, 6.1,128,6000,"BLACK"));
        phoneArrayList.add( new Phone(7, 32750,10,100,"HUAWEI GALAXY A6", Huawei, 3, 6.1,256,2400,"BLACK"));
        phoneArrayList.add( new Phone( 8,93200,10,100,"APPLE GALAXY A9", Apple, 4, 6.1,128,5300,"BLACK"));
        phoneArrayList.add( new Phone( 9,32000,10,100,"SAMSUNG GALAXY A44", Xiaomi, 8, 6.1,128,4211,"BLACK"));


        for (Phone phone:
             phoneArrayList) {
            System.out.println(phone.toString());
        }

        for (Notebook notebook:
                notebookArrayList) {
            System.out.println(notebook.toString());
        }
    }

}
