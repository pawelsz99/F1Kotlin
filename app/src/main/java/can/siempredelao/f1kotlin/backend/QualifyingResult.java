package can.siempredelao.f1kotlin.backend;

import com.google.gson.annotations.SerializedName;

public class QualifyingResult {

    public String      number;
    public String      position;
    @SerializedName("Driver")
    public Driver      driver;
    @SerializedName("Constructor")
    public Constructor constructor;
    @SerializedName("Q1")
    public String      q1;
    @SerializedName("Q2")
    public String      q2;
    @SerializedName("Q3")
    public String      q3;
}
