package can.siempredelao.f1kotlin.backend.model

import com.google.gson.annotations.SerializedName

class Result(val number: String,
             val position: String,
             val positionText: String,
             val points: String,
             @SerializedName("Driver") val driver: Driver,
             @SerializedName("Constructor") val constructor: Constructor,
             val grid: String,
             val laps: String,
             val status: String,
             @SerializedName("Time") val time: Time,
             @SerializedName("FastestLap") val fastestLap: FastestLap)
