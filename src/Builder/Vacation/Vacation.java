package Builder.Vacation;

import java.util.ArrayList;
import java.util.List;

public class Vacation {
    String name;
    List<Accommodation> accommodations = new ArrayList<Accommodation>();
    List<String> events = new ArrayList<String>();

    public void setName(String name){
        this.name = name;
    }

    //숙소 결정 메소드
    public void setAccommodations(List<Accommodation> accommodations) {
        this.accommodations = accommodations;
    }

    //이벤트 결정 메소드
    public void setEvents(List<String> events) {
        this.events = events;
    }

}
