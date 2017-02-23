package can.siempredelao.f1kotlin.backend;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RaceTable {

    public String     season;
    public String     round;
    public String     fastest;
    public String     position;
    public String     driverId;
    public String     constructorId;
    public String     grid;
    @SerializedName("Races")
    public List<Race> races;

}
