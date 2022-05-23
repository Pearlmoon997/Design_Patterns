package Builder.House;

public class HouseDirector {
    public static void main(String[] args) {
        HouseBuilder woodHouseBuilder = new WoodHouseBuilder();
        House woodHouse = woodHouseBuilder.addWalls().addWindows().addRoof().build();
        System.out.println(woodHouse);

        HouseBuilder stoneHouseBuilder = new StoneHouseBuilder();
        House stoneHouse = stoneHouseBuilder.addWalls().addWindows().addRoof().build();
        System.out.println(stoneHouse);

        HouseBuilder gingerbreadHouseBuilder = new GingerbreadHouseBuilder();
        House gingerbreadHouse = gingerbreadHouseBuilder.addWalls().addWindows().addRoof().build();
        System.out.println(gingerbreadHouse);
    }
}
