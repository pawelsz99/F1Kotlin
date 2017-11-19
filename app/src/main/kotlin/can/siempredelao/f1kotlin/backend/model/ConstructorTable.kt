package can.siempredelao.f1kotlin.backend.model

import com.google.gson.annotations.SerializedName

class ConstructorTable(val constructorId: String, @SerializedName("Constructors") val constructors: List<Constructor>)
