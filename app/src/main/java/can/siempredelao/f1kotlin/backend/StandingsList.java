package can.siempredelao.f1kotlin.backend;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StandingsList {

    public String               season;
    public String               round;
    @SerializedName("DriverStandings")
    public List<DriverStanding> driverStandings;

}
