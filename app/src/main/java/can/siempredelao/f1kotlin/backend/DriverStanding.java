package can.siempredelao.f1kotlin.backend;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DriverStanding {

    public String            position;
    public String            positionText;
    public String            points;
    public String            wins;
    @SerializedName("Driver")
    public Driver            driver;
    @SerializedName("Constructors")
    public List<Constructor> constructors;

}
