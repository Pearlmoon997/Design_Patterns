package Builder.House;

public class Roof {
    String name;
    String material;

    public Roof(String material) {
        this.name = "Roof made of" + material;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
