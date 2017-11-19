package can.siempredelao.f1kotlin.backend.model

import com.google.gson.annotations.SerializedName

class StandingsList(val season: String,
                    val round: String,
                    @SerializedName("DriverStandings") val driverStandings: List<DriverStanding>)
