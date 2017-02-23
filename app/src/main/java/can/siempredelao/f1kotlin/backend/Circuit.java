package can.siempredelao.f1kotlin.backend;

import com.google.gson.annotations.SerializedName;

public class Circuit {

    public String   circuitId;
    public String   url;
    public String   circuitName;
    @SerializedName("Location")
    public Location location;

}
