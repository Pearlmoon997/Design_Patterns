package Builder.House;

import java.util.ArrayList;
import Builder.House.HouseBuilder.HouseType;
import java.util.List;

public class House {
    String name;
    HouseType houseType;
    Roof roof;
    List<Wall> walls;
    List<Window> windows;

    public House() {
        this.walls = new ArrayList<Wall>();
        this.windows = new ArrayList<Window>();
    }

    public House setHouseType(HouseType houseType) {
        this.houseType = houseType;
        switch (houseType) {
            case WOOD: this.name = "Wood House"; break;
            case CLAY: this.name = "Clay House"; break;
            case GINGERBREAD: this.name = "Gingerbread House"; break;
            case STONE: this.name = "Stone House"; break;
        }
        return this;
    }
    House addRoof(Roof roof) {
        this.roof = roof;
        return this;
    }
    House addWall(Wall wall) {
        this.walls.add(wall);
        return this;
    }
    House addWindow(Window window) {
        this.windows.add(window);
        return this;
    }
}
