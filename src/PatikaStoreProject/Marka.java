package PatikaStoreProject;

/*
id : Markanın sistemde kayıtlı benzersiz numarası


name : Markanın adı

*/
public class Marka {

    private String name;
    private int id;

    public Marka(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
