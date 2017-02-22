package can.siempredelao.f1kotlin.backend;

import com.google.gson.annotations.SerializedName;

public class Location {

    public String lat;
    @SerializedName("long")
    public String _long;
    public String locality;
    public String country;

}
