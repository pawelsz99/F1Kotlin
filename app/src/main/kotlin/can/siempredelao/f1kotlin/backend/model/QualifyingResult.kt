package can.siempredelao.f1kotlin.backend.model

import com.google.gson.annotations.SerializedName

class QualifyingResult(val number: String,
                       val position: String,
                       @SerializedName("Driver") val driver: Driver,
                       @SerializedName("Constructor") val constructor: Constructor,
                       @SerializedName("Q1") val q1: String,
                       @SerializedName("Q2") val q2: String,
                       @SerializedName("Q3") val q3: String)
