package Builder.House;

public class Wall {
    String name;
    String material;

    public Wall(String material) {
        this.name = "Wall made of" + material;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
