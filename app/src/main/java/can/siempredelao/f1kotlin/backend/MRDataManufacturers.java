package can.siempredelao.f1kotlin.backend;

import com.google.gson.annotations.SerializedName;

public class MRDataManufacturers {

    public String           xmlns;
    public String           series;
    public String           url;
    public String           limit;
    public String           offset;
    public String           total;
    @SerializedName("ConstructorTable")
    public ConstructorTable constructorTable;

}
