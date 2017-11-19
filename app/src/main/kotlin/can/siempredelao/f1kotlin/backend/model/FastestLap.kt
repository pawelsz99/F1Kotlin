package can.siempredelao.f1kotlin.backend.model

import com.google.gson.annotations.SerializedName

class FastestLap(val rank: String,
                 val lap: String,
                 @SerializedName("Time") val time: Time_,
                 @SerializedName("AverageSpeed") val averageSpeed: AverageSpeed)
