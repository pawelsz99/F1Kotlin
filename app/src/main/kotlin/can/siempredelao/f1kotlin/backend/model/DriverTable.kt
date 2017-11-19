package can.siempredelao.f1kotlin.backend.model

import com.google.gson.annotations.SerializedName

class DriverTable(val driverId: String, @SerializedName("Drivers") val drivers: List<Driver>)
