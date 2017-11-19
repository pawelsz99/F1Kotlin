package can.siempredelao.f1kotlin.backend.model

import com.google.gson.annotations.SerializedName

class Location(val lat: String,
               @SerializedName("long") val _long: String,
               val locality: String,
               val country: String)
