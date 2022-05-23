package Builder.House;

public abstract class HouseBuilder {
    String builderName;
    enum HouseType {
        WOOD, CLAY, GINGERBREAD, STONE
    }
    HouseType houseType;
    House house = new House();

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
        house.setHouseType(houseType);
    }

    public abstract HouseBuilder addWalls();
    public abstract HouseBuilder addRoof();
    public abstract HouseBuilder addWindows();

    public House build() {
        System.out.println("Build");
        return house;
    }

}
