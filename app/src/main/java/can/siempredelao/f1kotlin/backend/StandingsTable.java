package can.siempredelao.f1kotlin.backend;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StandingsTable {

    public String              driverId;
    public String              driverStandings;
    @SerializedName("StandingsLists")
    public List<StandingsList> standingsLists;

}
