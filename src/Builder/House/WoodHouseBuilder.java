package Builder.House;

public class WoodHouseBuilder extends HouseBuilder{
    int numWalls = 6;
    int numWindows = 10;
    String windowMaterial = "Tempered Glass";
    String wallMaterial = "Wood, 4x6";
    String interiorWallMaterial = "Wood, 2x4";
    String roofMaterial = "Metal";
    public WoodHouseBuilder() {
        this.builderName = "Wood House Builder";
        setHouseType(HouseType.WOOD);
    }

    public HouseBuilder addWalls() {
        for (int i = 0; i < 4; i++) {
            System.out.println("wood for made of" + wallMaterial);
            house.addWall(new Wall(wallMaterial));
        }
        for (int i = 0; i < numWalls - 4; i++) {
            System.out.println("wood for interior wall made of" + wallMaterial);
            house.addWall(new InteriorWall(interiorWallMaterial));
        }
        return this;
    }

    public HouseBuilder addRoof() {
        house.addRoof(new Roof(roofMaterial));
        return this;
    }

    public HouseBuilder addWindows() {
        for (int i = 0; i < numWindows; i++) {
            System.out.println("Window made of" + windowMaterial);
            house.addWindow(new Window(windowMaterial));
        }
        return this;
    }

    public House build() {
        System.out.println("build Wood");
        return house;
    }
}
