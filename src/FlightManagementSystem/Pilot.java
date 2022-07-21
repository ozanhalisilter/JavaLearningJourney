package FlightManagementSystem;

public class Pilot {
    private String name;
    private String surname;
    private int level;

    public Pilot(String name, String surname, int level) {
        this.name = name;
        this.surname = surname;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
