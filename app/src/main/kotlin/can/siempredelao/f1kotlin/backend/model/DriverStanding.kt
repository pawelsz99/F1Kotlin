package can.siempredelao.f1kotlin.backend.model

import com.google.gson.annotations.SerializedName

class DriverStanding(val position: String,
                     val positionText: String,
                     val points: String,
                     val wins: String,
                     @SerializedName("Driver") val driver: Driver,
                     @SerializedName("Constructors") val constructors: List<Constructor>)
