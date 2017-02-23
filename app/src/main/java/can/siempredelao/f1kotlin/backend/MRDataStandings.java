package can.siempredelao.f1kotlin.backend;

import com.google.gson.annotations.SerializedName;

public class MRDataStandings {

    public String         xmlns;
    public String         series;
    public String         url;
    public String         limit;
    public String         offset;
    public String         total;
    @SerializedName("StandingsTable")
    public StandingsTable standingsTable;

}
