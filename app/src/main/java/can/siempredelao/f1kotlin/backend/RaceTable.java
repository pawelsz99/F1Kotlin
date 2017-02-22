package can.siempredelao.f1kotlin.backend;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RaceTable {

    public String season;
    @SerializedName("Races")
    public List<Race> races;

}
