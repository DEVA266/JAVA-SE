package ticket.booking.entites;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {
    private String TrainId;
    private String TrainNo;
    private List<List<Integer>> seats;
    private Map<String, Time> stationTime;
    private List<String> StationNames ;

}
