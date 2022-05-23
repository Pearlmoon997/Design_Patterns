package Builder.Vacation;

public class Hotel extends Accommodation {
    int roomNum;
    public Hotel() {
        this.name = "Hotel";
    }
    public Hotel(String name) {
        this.name = name;
    }
    public void setRoomNum(int n) {
        this.roomNum = n;
    }
    public int getRoomNum() {
        return this.roomNum;
    }

    public String getLocation() {
        if (roomNum == 0) return "";
        else return "Room Number" + this.roomNum;
    }
}
