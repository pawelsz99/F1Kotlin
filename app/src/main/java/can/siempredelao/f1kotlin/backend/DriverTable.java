package can.siempredelao.f1kotlin.backend;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DriverTable {

    public String       driverId;
    @SerializedName("Drivers")
    public List<Driver> drivers;
}
