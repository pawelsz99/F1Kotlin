package can.siempredelao.f1kotlin.backend;

import com.google.gson.annotations.SerializedName;

public class Race {

    public String season;
    public String round;
    public String url;
    public String raceName;
    @SerializedName("Circuit")
    public Circuit circuit;
    public String date;
    public String time;

}
