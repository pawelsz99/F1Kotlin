package can.siempredelao.f1kotlin.backend;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ConstructorTable {

    public String            constructorId;
    @SerializedName("Constructors")
    public List<Constructor> constructors;

}
