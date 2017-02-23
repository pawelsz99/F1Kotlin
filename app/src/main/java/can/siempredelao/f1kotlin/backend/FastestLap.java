package can.siempredelao.f1kotlin.backend;

import com.google.gson.annotations.SerializedName;

public class FastestLap {

    private String       rank;
    private String       lap;
    @SerializedName("Time")
    private Time_        time;
    @SerializedName("AverageSpeed")
    private AverageSpeed averageSpeed;

}
