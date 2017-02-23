package can.siempredelao.f1kotlin.backend;

import com.google.gson.annotations.SerializedName;

public class Result {

    private String      number;
    private String      position;
    private String      positionText;
    private String      points;
    @SerializedName("Driver")
    private Driver      driver;
    @SerializedName("Constructor")
    private Constructor constructor;
    private String      grid;
    private String      laps;
    private String      status;
    @SerializedName("Time")
    private Time        time;
    @SerializedName("FastestLap")
    private FastestLap  fastestLap;

}
