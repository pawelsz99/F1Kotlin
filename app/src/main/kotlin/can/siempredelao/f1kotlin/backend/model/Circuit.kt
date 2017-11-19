package can.siempredelao.f1kotlin.backend.model

import com.google.gson.annotations.SerializedName

class Circuit(val circuitId: String,
              val url: String,
              val circuitName: String,
              @SerializedName("Location") val location: Location)
