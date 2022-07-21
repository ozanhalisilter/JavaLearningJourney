package FlightManagementSystem;

public class Plane {
    private String name;
    private int state;
    private String model;
    private String id;

    public Plane(String name, int state, String model, String id) {
        this.name = name;
        this.state = state;
        this.model = model;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
